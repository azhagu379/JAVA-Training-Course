package TechnicalQuestion.Stringjava;

public class ConverUpperCase {
    public static void main(String[] args) {
        
        // program to convert string to uppercase

        StringBuilder a =new StringBuilder("My name is Alagappan");

        System.out.println(a);
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)>='a' &&a.charAt(i)<='z') 
            {
                int temp=(int)a.charAt(i)-32;   //97-32=65

                a.setCharAt(i, (char)temp);
            }
        }
        System.out.println(a);

        // program to convert string to lowercase.
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)>='A' &&a.charAt(i)<='Z') 
            {
                int temp=(int)a.charAt(i)+32;   //65+32=65
                a.setCharAt(i, (char)temp);
            }
        }
        System.out.println(a);
    }
    
}
