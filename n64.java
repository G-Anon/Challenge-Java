import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import static java.lang.System.*;

public class n64
{
    public static boolean isPrime(long n)
    {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        
        long sqrtN = (long)Math.sqrt(n)+1;
        
        for(long i = 6L; i <= sqrtN; i += 6)
            if(n%(i-1) == 0 || n%(i+1) == 0)
                return false;
            return true;
    }

    public static void spiralWrite(int xSize, int ySize, long matrix[][])
    {
        int i,  k = 0, l = 0; long MAX=xSize*ySize;
        xSize--;  ySize--;      

        while(k <= xSize && l <= ySize)
        {
            for(i = l; i <= ySize; ++i)
                matrix[k][i]=MAX--;
            k++;

            for(i = k; i <= xSize; ++i)
                matrix[i][ySize]=MAX--;
            ySize--;

            for(i = ySize; i >= l; --i)
                matrix[xSize][i]=MAX--;
            xSize--;

            for(i = xSize; i >= k; --i)
                matrix[i][l]=MAX--;
            l++;
        }
    }

    public static void main(String[] args) throws IOException
    {
        //SIZE is the size in which to create the Ulam Spiral; only change image size with this variable.
        final int SIZE = 2000;
        // create required variables/objects
        long[][] nums = new long[SIZE][SIZE];
        boolean[][] primeMap = new boolean[nums.length][nums.length];
        BufferedImage ulam = new BufferedImage(SIZE, SIZE, BufferedImage.TYPE_INT_RGB);
        out.println("Created long[][], boolean[][], BufferedImage.");

        //inserts needed numbers into the long[]
        spiralWrite(nums[0].length, nums.length, nums);
        out.println("long[][] now contains spiral.");

        //creates a boolean map showing all prime #'s in the array
        for(int y=0;y<nums.length;y++)
            for(int x=0;x<nums[y].length;x++)
                if(isPrime(nums[y][x]))
                    primeMap[y][x]=true;
        out.println("Prime Map created. Copying data to bufferedImage...");

        //create image
        for(int x=0;x<primeMap.length;x++)
            for(int y=0;y<primeMap[x].length;y++)
                if(primeMap[x][y]==true)
                    ulam.setRGB(x, y, 0);
                else ulam.setRGB(x, y, Integer.MAX_VALUE);
        out.println("Complete. Saving to local storage...");
        
        //save BufferedImage to PNG file
        try
        {
            ImageIO.write(ulam, "png", new File("img.png"));
        } catch(IOException e){}
        out.println("Done. Ulam Spiral created.");
    }
}
