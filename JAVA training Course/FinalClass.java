

final class finalClassDemo

{
    void display()
    {
        System.out.println("i am display");
    }

}
// we cannot extends the final class
/*class summa extends finalClassDemo
{

}*/


public class FinalClass {
    public static void main(String[] args) {
        
        finalClassDemo o=new finalClassDemo();
        o.display();
    }
    
}
