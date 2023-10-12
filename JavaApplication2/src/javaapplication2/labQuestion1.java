
package javaapplication2;
import java.util.Scanner;
class Student{
//    String name = "john";
//    int roll_no = 2;
    
    String name;
     int roll_no;
     
    public void setName(){
        this.name = name;
    }
    
    public String getName(String name){
        return name;
    }
    public void setRoll(){
        this.roll_no = roll_no;
    }
    public int getRoll(int roll_no){
        return roll_no;
    }
}
public class labQuestion1 {
    public static void main(String[] args){
    Student st = new Student();
    
//     System.out.println(st.name);
//     System.out.println(st.roll_no);
       System.out.println(st.getName("john"));
       System.out.println(st.getRoll(2));
      
}
    
}
