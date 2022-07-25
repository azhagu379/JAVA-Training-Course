package TechnicalQuestion.Method;

import java.util.Scanner;

class Methods
{
    // no return without arguments
    public void add()
    {
        /*Scanner in =new Scanner(System.in);
        System.out.println("Enter the First number :");
        int a=in.nextInt();
        System.out.println("Enter the Second Number:");
        int b= in.nextInt();*/
        int a=22,b=99;
        System.out.println("Addition :"+(a+b));
    }
    // no return with arguments
    // formal parameter
    //it won't return values in main method.
    public void sub(int x, int y)
    {
        System.out.println("Subtraction :"+Math.abs((x-y)));
    }

    //return type with out argumett
    public int mul(){
        int a=10;
        int b=44;
        return a*b;

    }
    //return type with argments

    public  int dev(int a, int b)
    {
       return a/b;
    }

    //recursion he is call him.
    public int factorial(int n)
    {
        if(n==1)
            return 1;
        else
            return (n*factorial(n-1));

    }
}


public class UserDefinedmethod {


    // static main class method create panna
    public static void main(String[] args) {

        Methods o=new Methods();
        o.add();
        o.sub(2, 8);
        System.out.println(o.mul());
        System.out.println(o.dev(2,2));
        System.out.println(o.factorial(6));

        
    }
    
}
