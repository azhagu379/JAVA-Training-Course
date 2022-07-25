
//static variables and Static Method

class staticTest{
    static int a=10;  //common value 
    int b=30;  // instance not static variable
    void show()
    {
        System.out.println("A :"+a+"  B :"+b );
    }
    static void display()
    {
        System.out.println("A :"+a+"B :"+a );
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        
        staticTest o1 =new staticTest();
        o1.show();
        staticTest o2 =new staticTest();
        o2.b=100;
        staticTest.a=109; 
        o2.show();
        
        o1.show();
    }
    
}
