
import java.util.Scanner;

class Assingnment_2_Q1
{
 
    public static void  PrintEven(int iNo)
    {
       if(iNo <=0)
       {
        return;
       }

       for(int iCnt =1 ;iCnt <=iNo;iCnt++)
       {
        System.out.print((iCnt *2)+"\t");
       }
    }
    static public void main(String...A)
    {  
        Scanner sobj =new Scanner(System.in);

         int iValue=0;
         

         System.out.println("Enter a number :");
         iValue =sobj.nextInt();

         PrintEven(iValue);
           
    }
}
