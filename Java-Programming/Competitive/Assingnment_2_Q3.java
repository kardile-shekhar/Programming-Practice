
import java.util.Scanner;

class Assingnment_2_Q1
{
 
    public static  void Display(int iNo)
    {
       

        if(iNo<10)
        {
            System.out.print("hello");

        }
        else
        {
            System.out.println("Demo");
        }

    }
    static public void main(String...A)
    {  
        Scanner sobj =new Scanner(System.in);

         int iValue=0;
       
         
         System.out.println("Enter a number :");
       iValue =sobj.nextInt();


         Display(iValue);

         
    }
}
