package TechnicalQuestion.Stringjava;

public class SmalltoUpper {
    public static void main(String[] args) {
        //program convert the given string into toggele case word
        //tOGGLE cASE wORD
        StringBuffer b=new StringBuffer("Hellow World");
        System.out.println(b);
        for(int i=0;i<b.length();i++)
        {
            if(b.charAt(i)>='a' && b.charAt(i)<='z')
            {
                int temp=b.charAt(i)-32;
                b.setCharAt(i, (char)temp);
            }
            else if(b.charAt(i)>='A' && b.charAt(i)<='Z')
            {
                int temp=b.charAt(i)+32;
                b.setCharAt(i, (char)temp);
            }
        }
        System.out.println(b);
    
    }
    
}
