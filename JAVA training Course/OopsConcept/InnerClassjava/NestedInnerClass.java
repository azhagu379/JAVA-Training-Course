package OopsConcept.InnerClassjava;


class outer{
    int a=50; // memmer data//properties

    class inner{// member of class
        int b=20; //inner class member variable

        void innerDisplay() //inner class member method
        {
            System.out.println("A : "+a);
            System.out.println("B :"+b);
        }
    }

    void outerDisplay() //member method
    { 
        inner i=new inner(); //inner class object creation
        i.innerDisplay();
        System.out.println("B from inner class by outer Display :"+i.b);

    }

}
public class NestedInnerClass {
    
    public static void main(String[] args) {
        
        outer o=new outer();
        o.outerDisplay();

        // we can access the inner class throug outer object
        outer.inner i=new outer().new inner();
        i.innerDisplay();
        
    }
}
