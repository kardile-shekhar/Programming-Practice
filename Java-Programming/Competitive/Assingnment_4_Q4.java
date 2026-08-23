
import java.util.Scanner;

class Assingnment_2_Q1
{
   

    public static int  SumNonFact(int iNo)
    {
        int iCnt = 0;
        int iSum=0;
    
         for(iCnt =1; iCnt<=iNo;iCnt++)
         {
            if(iNo % iCnt != 0)
            {
                 
                iSum =iSum+iCnt;
            }

        }
        return iSum;
    }
    public static void main(String...A)
    {  
        Scanner sobj =new Scanner(System.in);

         int iValue= 0;
         int iRet = 0;

         
         System.out.println("Enter a number");
         iValue = sobj.nextInt();
    
        iRet = SumNonFact(iValue);

        System.out.println(iRet);
      

        
        sobj.close();
         
    }
}
