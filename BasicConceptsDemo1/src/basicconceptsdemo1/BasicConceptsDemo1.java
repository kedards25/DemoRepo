package basicconceptsdemo1;

public class BasicConceptsDemo1 
{
    //non-static methods can access both static and non-static variables
    //whereas static methods can access static variables only
     static int num=8;

//    public BasicConceptsDemo1() {
//        num=9;
//    }
//    
//    //when class level variable and parameter passed in method or constructor 
//    //have same name we use "this" keyword to identify class level variable
//    public BasicConceptsDemo1(int num)
//    {
//        this.num=num;
//    }

    public BasicConceptsDemo1() {
        num++;
    }
    
    
    
    static void show()
 {
      System.out.println("Good Morning");
      System.out.println("Value: "+num);
 }
    
    //non-static method accessing static variable
    void showVal()
    {
        System.out.println("Number: "+num);
    }
    public static void main(String[] args) 
    {
//        BasicConceptsDemo1 basicConceptsDemo=new BasicConceptsDemo1(15);
//        basicConceptsDemo.show();
        
        
        //Calling static variable using diff objects
   /*     BasicConceptsDemo1 basicConceptsDemo1=new BasicConceptsDemo1();
        basicConceptsDemo1.showVal();
        
        BasicConceptsDemo1 basicConceptsDemo2=new BasicConceptsDemo1();
        basicConceptsDemo2.showVal();
        
        BasicConceptsDemo1 basicConceptsDemo3=new BasicConceptsDemo1();
        basicConceptsDemo3.showVal();
        */
        
         //Calling static variable without objects
       new BasicConceptsDemo1();
       show();
         new BasicConceptsDemo1();    
         show();
         new BasicConceptsDemo1();
        show();
    }

}
