package OopsConcept;

class Const{

    int length,width;
    int area()
    {
        int a=length*width;
        return a;
    }
    Const()
    {
        length=10;
        width=30;
        System.out.println("Constructor called");
    }
}
/*Constructor
     a constructor in java is a block of code similar to a method that's called when an instance of an object is created.
     1. a constructor doesn't have return type.
     2. the name of the constructor must be the same as the name of the class.
     3.unlike methods, constructors are not considered members of a class.
     4. A constructor is called automatically when a new instance of an object is created.

     Three different type of constructor are:
     1.Default constructor.
     2.Parameterized constructor
     3.copy constructor.

 *
 */
public class Constructorjava {
    public static void main(String[] args) {
        
        Const o=new Const();
        System.out.println(o.area());

    }
    
}
