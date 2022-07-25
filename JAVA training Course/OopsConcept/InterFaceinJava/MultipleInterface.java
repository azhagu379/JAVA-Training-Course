package OopsConcept.InterFaceinJava;

import OopsConcept.inheritanceAndPolyMorphism.singleinheritance;

// how Multiple inheritance can be achieved by implement multiple interfaces

class Phone
{
    void voice()
    {
        System.out.println("Make VoiceClass");
    }
    void sms()
    {
        System.out.println("We can send SMS");
    }
}
interface Camera{
    void click();
    void record();
}
interface Player
{
    void play();
    void pause();
    void stop();

}
class SmartPhone extends Phone implements Camera,Player{

    public void play() 
    {
        System.out.println("play music");
      
        
    }
    public void pause() 
    {
        System.out.println("pause music");
       
        
    }

   
    public void stop() 
    {
        System.out.println("stop music");
        
        
    }

   
    public void click() 
    {
        System.out.println("Take a selfi");
       
        
    }

    
    public void record() 
    {
        System.out.println("Take a video");
        
    }

}
public class MultipleInterface {
    public static void main(String[] args) {
        
        SmartPhone o=new SmartPhone();
        o.voice();
        o.sms();
        o.click();
        o.pause();
        o.play();
        o.record();
        o.stop();


    }
    
}
