package OopsConcept.InnerClassjava;

import java.security.AlgorithmConstraints;

//abstract class testDemo
//or
// interface iruntha public kaka change pannanum
interface testDemo
{
    abstract void display(); //we can't create object in abstract classs

}
class outerDemo{
    public void outerDisplay()
    {
        testDemo o= new testDemo() {

            @Override
            public // it's an interface. we need to change public
             void display() {
                System.out.println("Test Display");
               
                
            }
            
        };
        o.display();

    }

}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        outerDemo o=new outerDemo();
        o.outerDisplay();
    }
    
}
