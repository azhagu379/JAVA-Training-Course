package OopsConcept.InterFaceinJava;

//java 8 static ,defualt method create pannalam interface

interface demo{

    int a=23; // variable declare pannalam
              // by default final static irukkum


   public abstract void fun1(); //by defult public and  abstract
    void fun2();// we don't use in the interface private method

    public static void fun3() // define pannanumna static keyword use pannavendum.

    {
        System.out.println("I'm fun-3");

    }
}
interface demo1 extends demo{
    void fun4();            // new feature kaka defult pannalam
    default void fun5(){ // why do we use the defult method?
                        // oru new function create panna enga implement pannirukkoma anka ellam error varrum.
        System.out.println("Fun -5");

    }
    private void fun6() //java 8 above la private use pannalam
                        // outside of the class use panna mutiyathu
                        //but inside of the class use pannalam
    {

    }

}
class testinterface implements demo1{

    @Override
    public void fun1() {
        // TODO Auto-generated method stub
        System.out.println("Fun 1");
        
    }

    @Override
    public void fun2() {
        // TODO Auto-generated method stub
        System.out.println("Fun 2");
        
    }

    @Override
    public void fun4() {
        // TODO Auto-generated method stub
        System.out.println("Fun 4");
        
    }

   

}

public class interfaceModeDomo {
    public static void main(String[] args) {

        System.out.println("A:"+demo.a);
        demo.fun3();
        testinterface o=new testinterface();
        o.fun1();
        o.fun2();
        demo.fun3();
        o.fun4();
        o.fun5();
    }   
}
