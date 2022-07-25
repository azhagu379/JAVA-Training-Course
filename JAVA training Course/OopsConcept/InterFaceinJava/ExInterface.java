package OopsConcept.InterFaceinJava;


interface Animal{
    void sound(); // it is  default  public abstract 
    void sleep();

}
class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("The dog Sounds like: wooooo..");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep");
        
    }

}
public class ExInterface {

    public static void main(String[] args) {

        Dog o =new Dog();
        o.sound();
        o.sleep();
        
    }
    
}
