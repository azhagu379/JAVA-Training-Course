package OopsConcept.inheritanceAndPolyMorphism;

abstract class Mobile{
    void voice()
    {
        System.out.println("Voice call available");

    }
    abstract void camera();
    abstract void touch();

}
class Nokia extends Mobile
{


    

    @Override
    void camera() {
        System.out.println("Camera 8 pixel");
        
    }

    @Override
    void touch() {
        System.out.println("Touch Display 5.5 inch");
        
    }
}
    class Samsung extends Mobile
{
        @Override
    void camera() {
        System.out.println("Camera 16 pixel");
        
    }

    @Override
    void touch() {
        System.out.println("Touch Display 5 inch");
        
    }
    void fingerprint()
    {
        System.out.println("finger print spcial implement.");
    }
    
}

public class AbstractClassWithExample {
    public static void main(String[] args) {
        Nokia N=new Nokia();
        N.voice();
        N.camera();
        N.touch();
System.out.println("-----------------------------");
        Samsung S=new Samsung();

        S.voice();
        S.camera();
        S.touch();
        S.fingerprint();
        
    }
    
}
