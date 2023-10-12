
package javaapplication2;
import java.util.Scanner;
class employee{
    
    private String name ;
    employee(String name){
       this.name = name;
       System.out.println(name);
}
    employee(){
   
        this.name = "UNKNOWN";
        System.out.println(name);
    }
//    public String getName() {
//        return name;
//    }
    public void setName(String name) {
        this.name = name;
    }
}

public class labQuestion9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
         employee emp2 = new employee();
        
        // emp2.setName(sc.nextLine());
        
        
       employee emp = new employee(" fraz ahmad haidry");
    }
    
}
