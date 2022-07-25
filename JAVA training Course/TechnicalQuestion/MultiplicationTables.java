package TechnicalQuestion;

import java.util.Scanner;

// Write a program to print the multiplication table


public class MultiplicationTables {

public static void main(String[] args) {
    
    Scanner in=new Scanner(System.in);

    System.out.println("Enter the Table:");
    int t=in.nextInt();
    System.out.println("Enter the Limit:");
    int l=in.nextInt();

    for(int i=1;i<=l;i++)
    {
        System.out.println(i+" x "+t+"\t= "+ (i*t));
    }
}

    
}
