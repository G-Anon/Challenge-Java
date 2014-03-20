import java.util.*;
import static java.lang.System.*;

public class n43
{
    public static void main(String[] args)
    {
        //---create required variables---
        Scanner sc = new Scanner(in);
        String txt;
        char[] trans;
        //-------------------------------

        out.print("Text to Morse >> ");
        txt = sc.nextLine();
        txt = txt.replaceAll(" {2,}?", " ").toLowerCase();
        trans = txt.toCharArray();

        for(int x=0;x<trans.length;x++)
        {
            switch(trans[x])
            {
                //special characters
                case '.': out.print(".-.-.- ");break;
                case ',': out.print("--..-- ");break;
                case '?': out.print("..-.. "); break;
                case ' ': out.print("/ ");     break;
                case '#': out.print("...-.- ");break;
                case '$': out.print("...-..- ");break;
                case '@': out.print(".--.-. ");break;
                case '&': out.print(". ... "); break;
                case '+': out.print(".-.-. "); break;
                case '"': out.print(".-..-. ");break;
                case '_': out.print("..--.- ");break;
                case '/': out.print("-..-. "); break;
                case '-': out.print("-....- ");break;
                case '=': out.print("-...- "); break;
                case 39 : out.print(".----. ");break; // 39 = '
                //letters
                case 'a': out.print(".- ");  break;
                case 'b': out.print("-... ");break;
                case 'c': out.print("-.-. ");break;
                case 'd': out.print("-.. "); break;
                case 'e': out.print(". ");   break;
                case 'f': out.print("..-. ");break;
                case 'g': out.print("--. "); break;
                case 'h': out.print(".... ");break;
                case 'i': out.print(".. ");  break;
                case 'j': out.print(".--- ");break;
                case 'k': out.print("-.- "); break;
                case 'l': out.print(".-.. ");break;
                case 'm': out.print("-- ");  break;
                case 'n': out.print("-. ");  break;
                case 'o': out.print("--- "); break;
                case 'p': out.print(".--. ");break;
                case 'q': out.print("--.- ");break;
                case 'r': out.print(".-. "); break;
                case 's': out.print("... "); break;
                case 't': out.print("- ");   break;
                case 'u': out.print("..- "); break;
                case 'v': out.print("...- ");break;
                case 'w': out.print(".-- "); break;
                case 'x': out.print("-..- ");break;
                case 'y': out.print("-.-- ");break;
                case 'z': out.print("--.. ");break;
                //numbers
                case '1': out.print(".----");break;
                case '2': out.print("..---");break;
                case '3': out.print("...--");break;
                case '4': out.print("....-");break;
                case '5': out.print(".....");break;
                case '6': out.print("-....");break;
                case '7': out.print("--...");break;
                case '8': out.print("---..");break;
                case '9': out.print("----.");break;
                case '0': out.print("-----");break;
                default : out.print("...... "); break;
            }
        }
    }
}
