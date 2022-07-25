class Super{

    public  void display()
    {
        System.out.println("I am super Display");
    }
    final void finaldisply()
    {
        System.out.println("i am super final display");
    }
}
class sub extends Super
{
    public void display()//this is call overriding.
    {
        System.out.println("I am sub display");
    }

    // we can't overriding
    /* 
    final void finaldisply()
    {
        System.out.println("i am super final display");
    }
    */

}


public class FinalMethod {

    public static void main(String[] args) {
        

        sub o=new sub();
        o.display();
        o.finaldisply();
    }

    
}
