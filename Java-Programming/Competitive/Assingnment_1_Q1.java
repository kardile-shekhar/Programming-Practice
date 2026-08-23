
class Assingnment_1_Q1
{
 
    public int Divided(int iNo1, int iNo2)
    {
        int iAns =0;

        if(iNo2 == 0)
        {
            return -1;

        }
        iAns = iNo1/iNo2;
        return iAns;
        
    }
    static public void main(String...A)
    {
         if(A.length<2)
       {
          System.out.println("Usage : java Login <UsernName> <Password>");
          return;

       }


       String username =A[0];
       String password=A[1];

      if(username.equals("shekhar") && password.equals("11.21.51"))
        {
          System.out.println("Login Successfull");
        }
         else
        {

        System.out.println("Invalid Username OR Password");

        }


        
        int iValue1 = 15;
        int iValue2 =5;
        int iRet = 0;

        Assingnment_1_Q1 aobj = new Assingnment_1_Q1();

       iRet = aobj.Divided(iValue1,iValue2);

       System.out.println("Division is : "+iRet);


      
        
        
    }
}
