package OopsConcept;

/*
 * Nesting of Methods in java
 * 
 * method will call the  inside of method.this  is called nesting.
 * 
 */
class Demo{
    private int m,n;
    Demo(int x, int y)
    {
        m=x;
        n=y;
    }
    int largest()
    {
        if(m>n)
            return m;
        else    
            return n;
    }
    void display()
    {
        //nesting of method
        int larage=largest();
        System.out.println("The Greatest Number is :"+larage);
    }

}
public class NestingofMethod {
    public static void main(String[] args) {
        Demo o1=new Demo(22, 33);
        o1.display();
        
    }
    
}
