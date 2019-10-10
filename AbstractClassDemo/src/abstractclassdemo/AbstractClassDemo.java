package abstractclassdemo;

//Abstract classes have method declaration,not the definition
//Abstract classes contain methods without bodu
//Abstract classes can have abstract and non-abstract methods
//Abstract classes are considered to be incomplete classes and hence we have to 
//inherit the abstract class and need to override abstract methods in child class
//We cannot create object of Abstract class
//All the abstract methods have to be overridden in child class otherwise child 
//class also has to be declared abstract

abstract class AbstractClass{
    abstract void play();
    abstract void pause();
    void show(){
        System.out.println("From parent");
    }
}

abstract class DemoP extends AbstractClass
{
    @Override
    void pause()
    {
        System.out.println("Pause the music");
    }
}

public class AbstractClassDemo extends DemoP
{
    @Override
    void play()
    {
        System.out.println("Play the music");
    }
    public static void main(String[] args) 
    {
        AbstractClass abstractClass=new AbstractClassDemo();
        abstractClass.play();
        abstractClass.pause();
        abstractClass.show();
    }

}
