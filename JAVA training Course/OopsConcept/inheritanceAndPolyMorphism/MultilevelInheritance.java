package OopsConcept.inheritanceAndPolyMorphism;

class GrandFather{
    public void house()
    {
        System.out.println("3 BHK House.");
    }
}
class Father extends GrandFather{

    public void lant()
    {
        System.out.println("5 Arcs Land");
    }
}
class Son extends Father{
    public void car()
    {
        System.out.println("Own Audi car.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        Son o=new Son();
        o.house();
        o.lant();
        o.car();
        
    }
    
}
