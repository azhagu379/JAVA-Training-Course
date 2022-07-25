package TechnicalQuestion;

import java.util.Scanner;

public class ArrayCoutAddandEven {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of Elements:");

        int n=in.nextInt();
        int addcount=0,evencount=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {   
            System.out.println("Enter the element:\t"+(i+1));
            arr[i]=in.nextInt();
            if(arr[i]%2==0)
                evencount++;
            else 
                addcount++;
        }
        System.out.println("Even Numbers in Array:"+evencount);
        System.out.println("Add Numbers in Array:"+addcount);
    }
    
}
