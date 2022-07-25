package TechnicalQuestion.Stringjava;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        //program to revese a given string

        StringBuilder builder=new StringBuilder("Mani kandan is java developer");
        
        System.out.println(builder);
        StringBuilder b=new StringBuilder();
        for(int i=builder.length()-1;i>=0;i--)
        {
            b.append(builder.charAt(i));
        }
        System.out.println(b);
    
    }
    
}
