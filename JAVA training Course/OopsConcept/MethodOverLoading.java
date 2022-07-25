package OopsConcept;

//This is calling  method overloading

//static is keyword. you needn't to create the object.
// same method name differnt parameter and different data types.
class MathOPeration{
    public static int multiply(int a,int b)
    {
        return a*b;

    } 
    public static double multiply(Double a,double b)
    {
        return a*b;
        
    }
    public static int multiply(int a)
    {
        return a*a;
        
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        

        System.out.println("Myltiply 2 double values :"+MathOPeration.multiply(2.2, 2.2)); 
        System.out.println("Myltiply 2 integer value :"+MathOPeration.multiply(2, 2)); 
        System.out.println("Myltiply 1 integer  values :"+MathOPeration.multiply(2)); 
    }
    
}
