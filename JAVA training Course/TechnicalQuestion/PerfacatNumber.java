package TechnicalQuestion;

import java.util.Scanner;

public class PerfacatNumber {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the number:");
        int p=in.nextInt();
        int sum=0;
        for(int i=1;i<p;i++)
        {
            if(p%i==0)
            {
                sum=sum+i;

            }
        }
        if(p==sum)
            System.out.println(p+" is perfect Number");
        else 
            System.out.println(p+" is not perfect number");
        
    }
    
}
