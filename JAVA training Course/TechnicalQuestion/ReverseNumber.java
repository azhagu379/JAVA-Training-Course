package TechnicalQuestion;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the NUmber:");

        int n=in.nextInt();
        int sum=0;
        while(n!=0)
        {
            int l=n%10;
            sum=(sum*10)+l;
            n=n/10;
        }
        System.out.println("Reverse Number is:"+sum);
    }
    
}
