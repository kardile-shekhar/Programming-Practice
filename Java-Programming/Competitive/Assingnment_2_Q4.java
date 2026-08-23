
import java.util.Scanner;

class Assingnment_2_Q1
{
 
    public static  void Display(int iNo , int frequency)
    {
       int iCnt =0;
       if(frequency <0)
       {
        frequency = -frequency;
       }
       for(iCnt=1;iCnt<=frequency;iCnt++)
       {
        System.out.print(iNo+"\t");
       }

       

    }
    static public void main(String...A)
    {  
        Scanner sobj =new Scanner(System.in);

         int iValue=0;
         int iCount =0;

       
         
         System.out.println("Enter a number :");
       iValue =sobj.nextInt();

         System.out.println("Enter a frequency :");
       iCount =sobj.nextInt();

         Display(iValue,iCount);

         
    }
}
