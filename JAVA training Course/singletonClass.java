/*Mobile application development use pannuvom
 * 
 * Multiple object crete panna vitathu
 * at a time only one object create
 * we cann't create multiple object
 */

 class ABC{

    static ABC obj=null;
    private ABC(){}

    public static ABC getInstance()
    {
        if(obj==null)
            obj=new ABC();
        return obj;
    }
    void display()
    {
        System.out.println("I am Display");
    }
 }

public class singletonClass {
    
    public static void main(String[] args) {

        ABC o=ABC.getInstance();
        o.display();

        //ABC o2=new ABC();
       
        
       /* 
        ABC o1=new ABC(); // constructor private mathuna error varum 
        ABC o2=new ABC();
        ABC o3=new ABC();
        */ 
        
    }
}
