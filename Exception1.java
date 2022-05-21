import java.lang.*;
import java.util.*;

class Exception1
{
    public static void main(String a[])
    {
        int ans=0,No1=0,No2=0;
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter No1");
        No1 = sObj.nextInt();

        System.out.println("Enter No2");
        No2 = sObj.nextInt();
        try
        {

        ans = No1/No2;     // Exception prone
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Exception occured as"+obj);
        }

        System.out.println("Division is :"+ans);
        sObj.close();

    }
}