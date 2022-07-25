package OopsConcept;


class Rectangle{

    int length,width;
    void getDetails(int x,int y)
    {
        length=x;
        width=y;
    }
    int area(){
        int a=length* width;
        return a;
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        
        Rectangle o1=new Rectangle();
        o1.length=10;
        o1.width=20;
        System.out.println("Are of Rectangel:"+o1.area());

        
    }
    
}
