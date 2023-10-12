
package javaapplication2;

class MyEmployee{
    private int id;
    private String name;
    
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id = i;
    }
   public int getId(){  
       return id;
   }
}
public class ch9ps {
    public static void main(String args[]){
        MyEmployee harry = new MyEmployee();
       // harry.id = 29;
        //harry.name = "CodeWithHarry";  --> throws an error due to private access modifier 
        
        harry.setName("CodeWithHarry");
        harry.setId(22);
        
        System.out.println(harry.getName());
        System.out.println(harry.getId());
    }
}
