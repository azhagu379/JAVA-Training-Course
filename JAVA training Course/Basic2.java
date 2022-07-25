
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Basic2 {
    public static void main(String[] args) {
        
        //User input
        Scanner in=new Scanner(System.in);
        //a2+b2+2ab

        /*
         int=nextInt()
         float=nextFloat()
         Double=nextDouble()
         Byte=nextByte()
         Short=nextShort()
         char=next().AtChar(0);
         String=nextLine()
         String=next()===>single word
       

        System.out.println("Enter the A:");
        double a=in.nextDouble();

        System.out.println("Enter the B:");
        double b=in.nextDouble();
        double c=Math.pow(a,2)+Math.pow(b,2)+2*a*b;

       System.out.println("a2+b2+2ab:\t"+c);

  */
       /*
        if Statement

        
        System.out.println("Enter your Age:");
        int age=in.nextInt();
        if(age>=18)
            System.out.println("You are eligible For vote");
 */
        /*
        if.... else statement
         Leap year

         
        System.out.println("Enter the year:");
        int year=in.nextInt();
        if(year%4==0 ||(year%100==0 && year % 400==0))
            System.out.println("Year "+year+" is a leap year");
        else
            System.out.println("year "+year+" is not a leap year");
    */
    /*
     Else if Ladder:
     90-100 Grade-A
     80-89  Grade-B
     70 79  Grade-C
     <70 Grade D

     
    System.out.println("Enter the Average:");
    float avg=in.nextFloat();
    if(avg<=100 && avg>=90)
        System.out.println("A Grade");
    else if(avg<=89 && avg>=80)
        System.out.println("B Grade");
    else if(avg<=79 && avg>=70)
        System.out.println("C Grade");
    else 
        System.out.println("D grade");
        */
        /*
         Nested if State ment
         A company insures its drivers in the followning case:
            a. if the drivers is married
            b. if the driver is umarried, male & above 30 years of age
            c. if the driver is unmarried, female & avove 25 years of age
         */
        System.out.println("You are Married or NOt(Y/N):");
         char c=in.next().charAt(0);
         

         if(c=='n' ||c=='N')
         {
            System.out.println("Enter the Age:");
            int age=in.nextInt();
            if(age>=25){
            System.out.println("You are Male/Female(M/F):");
            char gender=in.next().charAt(0);
            if(age>=30 && (gender=='m' || gender=='M'))
                System.out.println("you are eligible");
            else if(age>=25 && (gender=='f' || gender=='F'))
                System.out.println("you are eligible");
            else 
                System.out.println("you are not eligible");
            }
            else 
                System.out.println("you are not");


         }
         else if(c=='Y' ||c=='y')
         {
            System.out.println("You are Eligible.");
         }
         else 
            System.out.println("invalid input.");


    


}
    
}
