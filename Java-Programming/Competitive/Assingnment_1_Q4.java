import java.util.*;
class Assingnment_1_Q1
{
 
   public static boolean Check(int iNo)
   {
    if((iNo % 5) == 0)
    {
        return true;

    }
    else
    {
        return false;

    }
   }
    static public void main(String...A)
    {  
        Scanner sobj = new Scanner(System.in);

         int iValue=0;
         boolean bRet = false;
         System.out.println("Enter number :");
         iValue =sobj.nextInt();


        

       bRet= Check(iValue);

       if(bRet == true)
       {
          System.out.println("Divisible by 5");
       }
       else
       {
        System.out.println("not Divisible by 5 ");
       }


       sobj.close();
      

    }
}
