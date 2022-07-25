package TechnicalQuestion;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        
        System.out.println("Enter the how many Number:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0,avg=0;
        for(int i=1;i<=n;i++)
        {   System.out.println("Entet the Number"+i+":");
            int mark=in.nextInt();
            sum=sum+mark;
        }
        System.out.println("Sum of "+n+ "number:"+sum);
        System.out.println(n+"Average of"+n+ "number:"+(sum/n));
    }

    
}
