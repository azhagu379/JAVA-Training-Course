package TechnicalQuestion;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int arm=in.nextInt();
        int copy=arm;
        int final_Value=0;
        while(arm !=0)
        {
            int r=arm%10;
            final_Value=final_Value+(r*r*r);
            arm /=10;

        }
        if(copy==final_Value)
            System.out.println(copy+"is Armstrong Number.");
        else 
            System.out.println(copy+"is not Armstrong Number");
    }
    
}
