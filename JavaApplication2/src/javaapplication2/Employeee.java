
package javaapplication2;
//import java.util.Scanner;

public class Employeee {
    
    String empName;
    double basicPay;
    
    Employeee(String empName, double  basicPay){
        this.empName = empName;
        this.basicPay = basicPay;
    }
    
    public double salarycal(){
        
        double HRA  = 0.3 * basicPay;
        double DA = 0.2 * basicPay;
        
        double totalSal = basicPay + HRA + DA;
        return totalSal;
        
    }
    public static void main(String args[]){
       // Scanner sc = new Scanner(System.in);
        
      Employeee emp = new Employeee("fraz",100000);
       double totSal = emp.salarycal();
       System.out.println("Emp name --> " + emp.empName);
       System.out.println("Basic Pay ---> " + emp.basicPay);
       System.out.println("Total sal--> " + totSal);
       
    }
    
}
