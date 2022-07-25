package TechnicalQuestion.Method;

class Binary2Decimal{

    public static void b2c()
    {
        int b=1100;
        int i=0,sum=0;
        while(b>0)
        {
            int r=b%10;
            sum=sum+(r*(int)Math.pow(2,i));
            b/=10;
            i++;
        }
        System.out.println(sum);

    }
}
public class B2D {
    public static void main(String[] args) {
        Binary2Decimal.b2c();
    }
    
}
