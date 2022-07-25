package TechnicalQuestion.Method;
// A method is a block of code that performs a specific task, it provides the reusablity of code

// Types of method 
/*
 1. User defined Methods
 2. Standard Library Methods 
 */
public class BasicMethod {

    public int add(int a, int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        BasicMethod b=new BasicMethod();
        System.out.println(b.add(10, 44));
    }
    
}
