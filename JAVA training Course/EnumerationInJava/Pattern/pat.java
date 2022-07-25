package EnumerationInJava.Pattern;

import java.util.Scanner;

public class pat {
    public static void main(String[] args) {
        
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int n1=(n*2);

    for(int i=1;i<n1;i++)
    {
        for(int j=1;j<=i;j++)
        {
           if(i<=n){
            if(i<=n && i%2==0)
                System.out.print(j);
            else
                System.out.print("*");
            }
            else if(i>n){
            if(i%2==0 && j<=(n1-i))
                System.out.print(n-j);
                
            else if(j<=(n1-i))
                System.out.print("*");
     
            }
        
        }
        System.out.println();
    }
}
    
}
