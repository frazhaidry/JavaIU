package javaapplication2;

class encapsulation {

   private int length;
   private  int breadth;
   
   encapsulation(int length , int breadth){
       this.breadth = breadth;
       this.length  = length;
   }

    public int getLength() {
        return length;
    }

//    public void setLength(int length) {
//        this.length  = length;
//    }

    public int getBreadth() {
        return breadth;
    }

//  public void setBreadth(int Breadth){
//      this.breadth  = breadth;
//  }
    
    public int square(){
        return length * length;
    }
    
    public int rectangle(){
        return 2*(length + breadth);
    }
}

public class labQuestion7 {

    public static void main(String args[]) {

        encapsulation  obj= new encapsulation(3 ,5);
        
        ///obj.length = 4;
       // obj.breadth = 22; --> we cannot access directly becate atributes are private ;
       
//       obj.setBreadth(2);
//       obj.setLength(2);
//        System.out.println(obj.getBreadth());
//        System.out.println(obj.getLength());
        
        System.out.println("area of square is : " + obj.square());
         System.out.println("perimeter of rectangle is : " + obj.rectangle());
        
        
    }
}
