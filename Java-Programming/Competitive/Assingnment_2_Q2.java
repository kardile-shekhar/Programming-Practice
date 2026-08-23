
import java.util.Scanner;

class Assingnment_2_Q1
{
 
    public static  void Display(int iNo)
    {
       

        while(iNo>0)
        {
            System.out.print("*\t");
            iNo--;

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
