

package javaapplication2;

import javaapplication2.Employee;
import java.util.Scanner;

class Employee{
    String name ;
    int year_of_joining ;
    int salary  ;
    String address  ;
    
    public void printDetails(){
     System.out.println("Name of the Employee " +name);
    System.out.println("year of joining of the Employee " +year_of_joining);
    System.out.println("Salary for the Employee " + salary);
    System.out.println("Address of the Employee " + address);   
    }
}
public class labQustion3 {
    public  static void main(String args[]){
    Employee emp = new Employee();
    Scanner sc = new Scanner(System.in);
    emp.name = "Fraz haidry";
    emp.year_of_joining = 2000;
    emp.salary = 25000;
    emp.address = "Integral Hostel";
    emp.printDetails();
    
    System.out.println();
    System.out.println("details of the second employee");
    Employee emp2 = new Employee();
    emp2.name = "harry";
    emp2.year_of_joining = 2001;
    emp2.salary = 30000;
    emp2.address = " integral university";
    emp2.printDetails();

// emp.name =  sc.nextLine();    
 //name = "fraz";
}
}