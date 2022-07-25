package OopsConcept.InnerClassjava;


class OutterClass{

    static int x=10; // that's why changed the static variable
    int y=20;
    static class InnerClassBasic{
        void display()
        {
            System.out.println("X :"+x);
            //error kattum x varible static mathunu solli
        }
    }
}
public class StaticClassjava {
    public static void main(String[] args) {
        
        OutterClass.InnerClassBasic o=new OutterClass.InnerClassBasic();
        o.display();
    }
}
