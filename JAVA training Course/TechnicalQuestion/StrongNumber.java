package TechnicalQuestion;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int s=sc.nextInt();
        int copy=s;
        int fact=1,ans=0;;
        while(s !=0)
        {
            int r=s%10;
            fact=1;
            for(int i=1;i<=r;i++)
            {  
                fact=fact *i;
            }
            ans=ans+fact;
            
            s=s/10;
        }
        if(copy==ans)
            System.out.println(copy+" Strong number");
        else    
            System.out.println(copy+" Not strong Number");
        
    }
    
}
