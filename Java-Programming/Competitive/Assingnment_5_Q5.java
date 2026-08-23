
import java.util.Scanner;
class Assingnment_2_Q1
{
    public static void   Pattern(int iNo)
    {
        int iCnt = 0;
        if(iNo <0)
        {
            iNo= -iNo;
        }

           for( iCnt=1;iCnt<=5;iCnt++)
           {
                 
                    System.out.println(iNo*iCnt);
              
                  
            }          
    }
    public static void main(String...A)
    {  
        Scanner sobj =new Scanner(System.in);
         int iValue= 0;
         
         System.out.println("Enter a number");
         iValue = sobj.nextInt();
    
         Pattern(iValue);
                 
        sobj.close();
         
    }
}
