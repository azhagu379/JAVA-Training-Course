package TechnicalQuestion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n=in.nextInt();
        int fir_N=-1,Sec_N=1,Total=0;

        for(int i=1;i<=n;i++)
        {    Total=fir_N+Sec_N;
             System.out.println(Total);
            
            fir_N=Sec_N;
            Sec_N=Total;

        }
        

    }
    
}
