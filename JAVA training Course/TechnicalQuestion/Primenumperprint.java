package TechnicalQuestion;

import java.util.Scanner;

public class Primenumperprint {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int f=0;
        for(int i=1;i<=999;i++)
        {
            for(int j=1;j<=999;j++)
            {
                if(i%j==0) 
                    f++;
            }
            if(f==2)
            {System.out.println(i);}
            f=0;

        }
    }
    
}
