
import java.util.Scanner;

class Assingnment_2_Q1
{
 
    public static  boolean Display(int iNo)
    {
       if(iNo%2 == 0)
       {
        return true;

       }
       else
       {
        return  false;
        
       }

    }
    static public void main(String...A)
    {  
        Scanner sobj =new Scanner(System.in);

         int iValue=0;
          boolean bRet=false;

         System.out.println("Enter a number :");
       iValue =sobj.nextInt();

        bRet= Display(iValue);
        if(bRet == true)
        {
              System.out.println("number is even ");
        }
        else
        {
          System.out.println("number is Odd");
        }
      

         
    }
}
