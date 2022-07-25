package TechnicalQuestion;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=in.nextInt();
        int f=0;
        //1 n=2;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                f++;

            }
        }
        if(f==2)
        {
            System.out.println(n+"is a prime number");
        }
        else 
            System.out.println(n+"is not prime number");

    }
    
}
