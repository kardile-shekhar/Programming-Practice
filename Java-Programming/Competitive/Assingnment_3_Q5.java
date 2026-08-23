
import java.util.Scanner;

class Assingnment_2_Q1
{
   

    public static boolean  ChkVowel(char ch)
    {
       if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U' ||
       ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
       {
           return  true;
       }
       else
       {
         return  false;

       }
       

    }
    static public void main(String...A)
    {  
        Scanner sobj =new Scanner(System.in);

         char cValue='\0';
         boolean bRet = false;

         
         System.out.println("Enter a character\n");
         cValue = sobj.next().charAt(0);
    
        bRet = ChkVowel(cValue);

        if(bRet == true)
        {
         System.out.println("It is Vowel");
        }
        else
        {
         System.out.println("It is not Voewl");
        }

        sobj.close();
         
    }
}
