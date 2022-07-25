package EnumerationInJava;
/*
 * Enumeration in java
 * is special class
 * enum -keyword
 * used to handle the consonant value
 * 
 * 
 * android development
 * ok or clear button use pannalam
 * 
 */



public class enumDemo {

    enum GameLevel{
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {

        //assign Enum variable

        GameLevel a= GameLevel.HIGH;
        System.out.println(a);
        
        // use enum in swith

        switch(a){
            case  LOW:
                System.out.println("Low level");
                break;
            case  MEDIUM:
                System.out.println("Medium level");
                break;
            case  HIGH:
                System.out.println("High level");
                break;
            default:
                System.out.println("No selectio");
                break;
        }

        // Enum by loop

        for(GameLevel level:GameLevel.values()){
            System.out.println(level);
        }
        
    }
    
}
