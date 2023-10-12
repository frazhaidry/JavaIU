
package javaapplication2;

class Animal{
   //public String walk;
    
    public  void walk(){
        System.out.println("i can walk ");
        
    }
    public void sound(){
        System.out.println("i can talk in class ");
        
    }
}
class Cat extends Animal {
  //  public String meow;
    public void meow(){
        System.out.println("meow meow ");
    }
    
}
public class labQuestion5 {
      public static void main(String[] args) {
          
          Cat obj = new Cat(); 
          //System.out.println(obj.meow());
          //System.out.println(obj.walk());
          obj.walk();
          obj.meow();
          
         
      }
}
