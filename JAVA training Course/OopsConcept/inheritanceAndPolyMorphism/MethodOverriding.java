package OopsConcept.inheritanceAndPolyMorphism;
// Method overriding in java
class User{ //Base class or super class or parent class

    String name;
    int age;
    User(String n,int a)
    {
        this.name=n;
        this.age=a;
    }
    public void display()
    {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }

}
class MainProgrammer extends User{ //derived class or child class

        String companyname;
        MainProgrammer(String n,int a,String c)
        {
            super(n, a);
            this.companyname=c;

        }
        @Override
        public void display()
    {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Company Name :"+companyname);
    }

}
public class MethodOverriding {
    public static void main(String[] args) {
        
        User o=new User("mani", 21);
        o.display();
        MainProgrammer o1=new MainProgrammer("Raja", 22, "A-65");
        o1.display();
    }
    
}
