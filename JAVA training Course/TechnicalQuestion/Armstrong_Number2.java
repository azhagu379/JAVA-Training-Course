package TechnicalQuestion;

public class Armstrong_Number2 {

    // write a program to find the armstrong number form 100-999
    
    public static void main(String[] args) {

        int digit1, digit2,digit3;

        for(int i=100;i<=999;i++)
        {
            int temp=i;
            digit1=temp%10;
            temp=temp/10;

            digit2=temp%10;
            temp=temp/10;


            digit3=temp%10;
            temp=temp/10;
            int result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
            if(i==result)
                System.out.println(i+" is the armstrong Number");
        }
        
    }
    
}
