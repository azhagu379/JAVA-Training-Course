import java.util.Scanner;

public class SwitchStmt {
    public static void main(String[] args) {
         //Switch statement

         Scanner in=new Scanner(System.in);
         System.out.println("1.Addion\t:");
         System.out.println("2.Subtraction\t:");
         System.out.println("3.Multiplication\t:");
         System.out.println("4.Division\t:");
         System.out.println("Enter your Choice:");
         int c=in.nextInt();
       
         System.out.println("Enter the First Number\t:");
         int a=in.nextInt();

         System.out.println("Enter the secound Number\t:");
         int b=in.nextInt();

         switch(c){
            case 1:
                System.out.print("1.Addion\t:");
                System.out.print(a+"+"+b+"="+(a+b));
                break;
            case 2:
                System.out.print("2.Subtraction\t:");
                System.out.print(a+"-"+b+"="+(a-b));
                break;
            case 3:
                System.out.print("3.Multiplication\t:");
                System.out.print(a+"*"+b+"="+(a*b));
                break;
            case 4:
                System.out.print("4.Division\t:");
                System.out.print(a+"/"+b+"="+(a/b));
                break;
            default: 
                System.out.println("one more");


         }
            



    }
    
}
