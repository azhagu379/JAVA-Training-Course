package OopsConcept;

/*Data abstraction is the process of hiding certain details and showing only essential information to the user
 *
 * Abstraction can be achieved with either abstract classes or inter faces.
 *  Abstract class must have one abstract method.
 *  we can't create object using abstract class.
 *  Abstract class can have abstract and non abstact method
 * 
 */ 
// Abstract Class in java Programming
abstract class shape{

    abstract void draw();
    void message()
    {
        System.out.println(" Message from shape");
    }
}
class Round extends shape{

    @Override
    void draw() {
        System.out.println("Hello World");     
    }
    

}


public class AbstractClass {
    
    public static void main(String[] args) {
        Round o=new Round();
        o.draw();
        o.message();
    }
}
