
import java.util.Scanner;

class Assingnment_2_Q1
{
 
    public static void  DisplayFactor(int iNo)
    {
       int i =0;
       if(iNo <= 0)
       {
        iNo = -iNo;

       }
       for(i = 1; i<=iNo/2;i++)
       {
         if(iNo%i == 0 && i % 2 == 0)
         {
            System.out.println(i+"\t");
         }
          
       }
    }
    static public void main(String...A)
    {  
        Scanner sobj =new Scanner(System.in);

         int iValue=0;
         
         System.out.println("Enter a number :");
         iValue =sobj.nextInt();
    
         DisplayFactor(iValue);
         
    }
}
