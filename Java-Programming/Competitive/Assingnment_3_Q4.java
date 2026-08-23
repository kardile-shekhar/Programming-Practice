
import java.util.Scanner;

class Assingnment_2_Q1
{
 
    public static void  DisplayConvert(int CValue)
    {
     
       if((CValue >= 'a') && (CValue <= 'z'))
       {      
           System.out.println((char)(CValue -32));
       }
       else
       {
         
          System.out.println((char)(CValue +32));
       }
    }
    static public void main(String...A)
    {  
        Scanner sobj =new Scanner(System.in);

         char cValue=0;
         
         System.out.println("Enter a Charector :");
         cValue =sobj.next().charAt(0);
    
         DisplayConvert(cValue);
         
    }
}
