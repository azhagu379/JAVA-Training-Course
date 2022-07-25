package OopsConcept.inheritanceAndPolyMorphism;

class Father//base class
{
    public void house()
    {
        System.out.println("Have Own 2BHK House.");
    }
}
class Son extends Father//derived
{
    public void car()
    {
        System.out.println("Have Own Audi Car");
    }
}

public class singleinheritance {
    
    public static void main(String[] args) {
        
        Son s=new Son();
        s.house();
        s.car();
    }
    
}
