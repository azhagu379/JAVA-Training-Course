package TechnicalQuestion.Stringjava;

public class CountUperLowerAndOther {
    public static void main(String[] args) {
        
        // program to count uper case ,lowercase,space,Number, vowels and syols in a string:

        String s="Hello world Im Alagappan. my Email is azha379@gamil.com t";
        int upper=0,lower=0,number=0,space=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                upper++;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
                lower++;
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
                number++;
            else if(s.charAt(i)==' ')
                space++;
            
        }
        System.out.println(s.length());
        System.out.println("Uppercase in the String: "+upper);
        System.out.println("Lowercase in the String: "+lower);
        System.out.println("Nubers in the String: "+number);
        System.out.println("Space in the String: "+space);
        System.out.println("Special Character in the String: "+(s.length()-(upper+lower+number+space)));
    }
    
}
