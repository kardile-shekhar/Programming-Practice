
import java.util.Scanner;

class Assingnment_2_Q1
{
   

    public static int  MultFact(int iNo)
    {
        int iCnt = 0;
        


         for(iCnt =iNo/2; iCnt>=1;iCnt--)
         {
            if(iNo % iCnt == 0)
            {
                 System.out.println(iCnt);
                 
            }
              
         }
         return iCnt;
         
    }
    static public void main(String...A)
    {  
        Scanner sobj =new Scanner(System.in);

         int iValue= 0;
         int iRet = 0;

         
         System.out.println("Enter a number\n");
         iValue = sobj.nextInt();
    
        iRet = MultFact(iValue);
      

        
        sobj.close();
         
    }
}
