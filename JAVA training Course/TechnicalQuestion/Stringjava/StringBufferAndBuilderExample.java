package TechnicalQuestion.Stringjava;

public class StringBufferAndBuilderExample {

    public static void main(String[] args) {
        //StringBuffer & StringBuilder in java
        //Thread safe  & non thread safe.
//StringBuffer buffer=new StringBuffer("Alagu");
        StringBuilder buffer=new StringBuilder("Alagu");

        System.out.println(buffer);
        // append the string
        buffer.append("379");
        System.out.println(buffer);
        // insert in particular location
        buffer.insert(5," Mani ");
        System.out.println(buffer);

        //Replace @@@
        buffer.replace(10, 11, "@@@");
        System.out.println(buffer);

        //delete
        buffer.delete(10, 12);
        System.out.println(buffer);
        //Reverse
        buffer.reverse();
        System.out.println(buffer);
        //charAt
        System.out.println(buffer.charAt(0));
        System.out.println(buffer.length());
        System.out.println(buffer.substring(0));
        System.out.println(buffer.substring(0,5));

        buffer.setCharAt(0, 'A');
        System.out.println(buffer);

        //default 16 (2*20)+2=42
        System.out.println(buffer.capacity());

        //
        StringBuffer nBuffer=new StringBuffer("mani");
        System.out.println(nBuffer.capacity());
        nBuffer.append("my name is mani kandan");
        System.out.println(nBuffer.capacity());
    }
    
}
