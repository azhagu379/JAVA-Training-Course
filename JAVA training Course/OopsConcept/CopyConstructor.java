package OopsConcept;


// copyconstructor in java
class complex{

    private int real,img;
    public complex(){
        this.real=0;
        this.img=0;

    }
    public complex(int r,int i)
    {
        this.real=r;
        this.img=i;

    }

    // This is the copy constructor
    public complex(complex o2)
    {
        this.real=o2.real;
        this.img=o2.img;

    }
    public String toString()
    {
        return "("+real+"+"+img+"i)";
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        
        complex o1=new complex();
        System.out.println("Object 1 :"+o1);

        complex o2=new complex(3,2);
        System.out.println("Object 1 :"+o2);

        // one class object copy to send another class argruments;
        complex o3=new complex(o2);
        System.out.println("Object 1 :"+o3);
        
        
    }
    
}
