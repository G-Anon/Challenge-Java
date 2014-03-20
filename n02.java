import java.util.*;
import static java.lang.System.*;

public class n02
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(in);
		while(true)
		{
			String s = sc.next(); s.replaceAll("\\s+", ""); s.toLowerCase();
			double temp = Double.parseDouble(s.substring(0, s.length()-1));
			if(s.charAt(s.length()-1)=='f')
			{temp = (((temp-32)*5)/9); out.printf("%,.2fC", temp);}
			if(s.charAt(s.length()-1)=='c')
			{temp = (((temp*9)/5)+32); out.printf("%,.2fF", temp);}
			out.println();
		}
	}
}
