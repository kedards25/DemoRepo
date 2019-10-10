package interfacedemo;

//methods of interface are public abstract by default
interface DemoP
{
    DemoP demoP=new InterfaceDemo();
    void play();
    void pause();
}

public class InterfaceDemo implements DemoP
{
    //as default access specifier is "default" in Java
    //we have to make the methods from interface as public explicitly
    public void play()
    {
        System.out.println("play the song");
    }
    
    public void pause()
    {
        System.out.println("pause the song");
    }
    public static void main(String[] args) 
    {
        demoP.play();
        demoP.pause();
    }

}
