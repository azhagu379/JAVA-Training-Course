package OopsConcept;

class ShapeRectangle
{
    private int length,width;
    
    

    
    int area()
    {
        int a=getLength()*getWidth();
        return a;
    }


    //getter
    public int getWidth() {
        return width;
    }


    //setter
    public void setWidth(int w) {
        width = w;
    }


    //getter
    public int getLength() {
        return length;
    }


    //setter
    public void setLength(int l) {
        length = l;
    }
    

}

public class GetterSetter {
    public static void main(String[] args) {
        
        ShapeRectangle o=new ShapeRectangle();

        o.setLength(10);
        o.setWidth(20);
        System.out.println("Area of Rectangle :"+o.area());

    }
    
}
