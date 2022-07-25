package TechnicalQuestion.Method;

import java.util.Scanner;

class Deci_Binary
{
    public static void d2c(int d)
    {
        String a="";
        int i=0;
        while(d >0)
        {
            int r=d%2;
            a=r+a;
            d=d/2;
        
        }
        System.out.println(a);
    }
    public static void alternative_d2c(int d)
    {
        int[] arr=new int[100];
        int i=0;
        while(d>0)
        {
            arr[i]=d%2;
            d=d/2;
            i++;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(arr[j]);
        }
    }

}

public class UseStaticDeci2Binary {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter the Decimal Value:");
        int d=in.nextInt();

        Deci_Binary.d2c(d);
        Deci_Binary.alternative_d2c(d);
        
    }
    
}
