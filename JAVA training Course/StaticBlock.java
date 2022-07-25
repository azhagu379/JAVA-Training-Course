class BlockTest{
    static{
        System.out.println("Block Test-1");
    }
    static{
        System.out.println("Block Test-2");
    }
}


public class StaticBlock {

    static{
        System.out.println("Block-1");
    }

    public static void main(String[] args) {
    System.out.println("Main");

    BlockTest o=new BlockTest();
    System.out.println("Main");

        
    }
    static{
        System.out.println("Block-2");
    }
    
}
