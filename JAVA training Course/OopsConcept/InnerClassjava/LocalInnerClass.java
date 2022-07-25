package OopsConcept.InnerClassjava;


//Local Inner Class
class Outter{

    void display()
    {   // this the local inner class like local variable
        class inner{ // intha scope kulla mattum than work agum
            void innerDisplay()
            {
                System.out.println("Inner Display");
            }
        }
        inner i=new inner();
        i.innerDisplay();
    } 
}

public class LocalInnerClass {
    public static void main(String[] args) {
        
        Outter o=new Outter();
        o.display();
    }
    
}
