package TechnicalQuestion;


import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        //write a program to find the factor of the given number.
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Factor Numbers:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                System.out.println(i);
        }


    }
    
}
