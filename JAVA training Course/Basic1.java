public class Basic1 {

    public static void main(String[] args) {
        
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);

        }

        // single leve command
        /* multiline command */

        String name="Alagu";
        int age=25;
        float percent=25.23f;
        char gender='M';
        boolean married=false;
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Percentage:"+percent);
        System.out.println("Gender:"+gender);
        System.out.println("Married:"+married);



        //type casting in java
        /*
         * widening casting
         *  byte-> short-> char-> int-> long->float->double
         * 
         * narrowing Casting 
         *  double->float->long->int->char->short->byte
         * 
         */
        int a=10 ,c;
        double b=a, d=25.53;
        c=(int)d;
        //widening casting
        System.out.println("Int:"+a);
        System.out.println("Double:"+b);

        //narrowing casting
        System.out.println("Double:"+d);
        System.out.println("Int:"+c);


        //Arithmetic Operation

        int e=123,f=30;
        System.out.println("Addition:"+(e+f));
        System.out.println("subtration:"+(e-f));
        System.out.println("Multiplication:"+(e*f));
        System.out.println("Division:"+(e/f));
        System.out.println("Modulus:"+(e%f));


        /*
         * Arthmetic A assignment operator
         *   =    a=123           a=123
         *   +=   a +=10;         a=a+10
         *   -=   a -=10;         a=a-10
         *   *=   a *=10;         a=a*10
         *   /=   a /=10          a=a/10
         *   %=   a %=10          a=a%10
         * 
         */
        a=123;
        System.out.println(a);
        System.out.println(a+=10);
        System.out.println(a-=10);
        System.out.println(a*=10);
        System.out.println(a/=10);
        System.out.println(a%=10);

         /*Relational operator
         Operator   Name                Example
         ==         Equal to            a==b
         !=         Not equal           a !=b
         >          Greater than        a>b
         <          less than           a<b
         >=         grader than equal   a>=b
         <=         less than equal     a<=b       
        
         */
        c=19;

        System.out.println("Equal to:"+(a==c));
        System.out.println(a!=c);
        System.out.println(a>c);
        System.out.println(a<c);
        System.out.println(a>=c);
        System.out.println(a<=c);

        /*
         Logical Operator
        And &&
        OR ||

         */
        int mark1=65;
        int mark2=75;

        System.out.println("And &&  :"+(mark1>=35 && mark2>=35));
        System.out.println("OR ||  :"+(mark1>=35 || mark2>=35));

        // TERNARY OPERATOR
        //  ? : ;

        a=25;
        c=44;
        e=a>c?a:c;
        System.out.println("The greatest Number is:"+c);
        /*
         UNARY OPERATORS IN JAVA 
         ++ --
         A++;
         A--;
         */
        System.out.println(a++);//25
        System.out.println(++a);    //27
        
        /*
         Bitwise & shift operator in java

         And &
         or |
         xor ^
         Nor ~

         */
        a=2;
        c=3;
        System.out.println("Bitwise And  & :" +(a&c));
        System.out.println("Bitwise or | :" +(a|c));
        System.out.println("Bitwise XOR  ^:" +(a^c));
        System.out.println("Bitwise not   ~:" +(~a));

        /*Shift operator(postive value)
        singned
        >>-right shift
        <<-left shift
         unsingned(- values ex -10)
         >>>-right shift
         <<<-left shift

         */
        a=10;
        c=-10;
        System.out.println("signed Right shift:"+(a>>2));
        System.out.println("signed left shift:"+(a<<2));
        System.out.println("unsigned Right shift:"+(c>>>2));
        System.out.println("usigned left shift:"+(c<<2));
        



    }
    
}
