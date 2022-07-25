package OopsConcept;

class Student
{
    public int roll_no;
    public String name;

    Student(int roll_no,String name)
    {
        this.roll_no=roll_no;
        this.name=name;

    }
    void print()
    {
        System.out.println("Name    :"+name);
        System.out.println("Roll No :"+roll_no);
        System.out.println("-----------------------");
    }

}

public class ArrayofObject {
    public static void main(String[] args) {
        //Normal object Creation;
       /* Student o1=new Student(101, "Mani");
        o1.print();
        Student o2=new Student(101, "Mani");
        o2.print();*/ 
        

        //Array of object in java
        Student[] arr=new Student[6];
        arr[0]=new Student(10, "Mani");
        arr[1]=new Student(11, "Mani Kandan");
        arr[2]=new Student(12, "Alagu");
        arr[3]=new Student(13, "Alagu379");
        arr[4]=new Student(14, "Azhagu");
        arr[5]=new Student(15, "Azha");
        for(int i=0;i<arr.length;i++)
            arr[i].print();
    }
    
}
