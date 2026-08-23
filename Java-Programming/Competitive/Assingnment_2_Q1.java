
import java.util.Scanner;

class Assingnment_2_Q1
{
 
    public static  void Display(int iNo)
    {
        int iCnt =1;

        while(iCnt<=iNo)
        {
            System.out.print("*\t");
            iCnt++;
            
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
