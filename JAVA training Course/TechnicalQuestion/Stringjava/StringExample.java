package TechnicalQuestion.Stringjava;

import java.util.Arrays;

public class StringExample {

    public static void main(String[] args) {
        
        String a=" Alagu ";
        String b="alagu";
        System.out.println("A : "+a);
        System.out.println("B : "+b);
        System.out.println("A HashCode : "+a.hashCode());
        System.out.println("B HashCode : "+b.hashCode());

        System.out.println("Equals :"+a.equals(b));
        System.out.println("Equals :"+a.equalsIgnoreCase(b));
        System.out.println("Length :"+a.length());
        System.out.println("CharAt :"+a.charAt(0));
        System.out.println("UpperCase :"+a.toUpperCase());
        System.out.println("LowerCase :"+a.toLowerCase());
        System.out.println("Replace :"+a.replace("Al", "Azh"));
        System.out.println("Contain :"+a.contains("gu"));
        System.out.println("Empty :" +a.isEmpty());
        System.out.println("EndWith :"+a.endsWith("gu"));
        System.out.println("Startwith :"+a.startsWith("Al"));
        System.out.println("Substring :"+a.substring(2));
        System.out.println("Substring :"+a.substring(0,4));
        
        char[] carray=a.toCharArray();
        System.out.println("toCharArray :"+Arrays.toString(carray));
        System.out.println("Trim :"+a.trim());

        //chaing options use pannalam
        System.out.println("Trim :"+a.trim());
        System.out.println("Trim :"+a.trim().length());

    }
    
}
