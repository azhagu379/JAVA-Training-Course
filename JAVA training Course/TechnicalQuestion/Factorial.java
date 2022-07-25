package TechnicalQuestion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        //1.Write a program to find the factorial of given number.

        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Factroil Number:");
        int n=in.nextInt();
        int fact=1;

        for(int i=1;i<=n;i++)
        {
            fact=fact*i;

        }
        System.out.println(fact);
    }
    
}
