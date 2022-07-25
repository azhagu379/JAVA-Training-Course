class Test{
    final int MIN=1;
    final int MAX;
    final int NORMAL;
    Test(int normal)
    {
        NORMAL=normal;
        MAX=100;

    }
    void display()
    {
        System.out.println("Min :"+MIN);
        System.out.println("MAX :"+MAX);
        System.out.println("NORMAL :"+NORMAL);
    }
}

public class FinalVariable {

        public static void main(String[] args) {
            
            Test o=new Test(50);
            o.display();
        }
    
}
