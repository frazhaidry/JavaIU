
package javaapplication2;
import java.util.Scanner;
//WAP to add two variable km and two variable mtr belonging to two different obj 
//and print using the third obj. by making three method show,input,add;
public class IUobject {
    int km;
    int mtr;
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a km");
        km = sc.nextInt();
        System.out.println("Enter the value of meter");
        mtr = sc.nextInt();
    }
    
    public static  IUobject  add(IUobject ob1 ,IUobject ob2){
       IUobject result = new IUobject();
        result.km = ob1.km +ob2.km;
        result.mtr = ob1.mtr + ob2.mtr;
         return result;
    }
    public void show(){
        System.out.println("sum of km: " + km);
        System.out.println("sum of meter: " + mtr);
    }
    
    
   public static void main(String args[]){
       IUobject ob1 = new IUobject();
       IUobject ob2 = new IUobject();
       ob1.input();
       ob2.input();
//       IUobject obj = new IUobject();
//       obj = add(ob1,ob2);


         IUobject obj = add(ob1,ob2);
       
//       System.out.println("Sum of km and meter:");
        obj.show();
   }
}
