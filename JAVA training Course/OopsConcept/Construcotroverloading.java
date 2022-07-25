package OopsConcept;
class Box
{
    float length,breadth;
    //Constructor overloading
   public Box(){ // default constructor
        length=2;
        breadth=5;

    }
    public Box(float x,float y )
    {       //Parameterized construcor
        length=x;
        breadth=y;


    }
    public Box(float x)
    {       //Parameterized construcor
        length=breadth=x;


    }
    float area()
    {
        return length*breadth;
    }
}

public class Construcotroverloading {
    public static void main(String[] args) {
        //default constructor
        Box o=new Box();
        System.out.println(o.area());

        //Parameterized constructor
        Box o1=new Box(10,20);
        System.out.println(o1.area());

        //single parameterized constructor
        Box o2=new Box(10);
        System.out.println(o2.area());
        

    }
    
}
