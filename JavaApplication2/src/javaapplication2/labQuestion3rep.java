
package javaapplication2;

import java.util.Scanner;

class Employee{
    public String name ;
    public int year_of_joining ;
    public  int salary  ;
    public String address  ;
    
    public void printDetails(){
    System.out.println("Name of the  Employee " + name);
    System.out.println("year of joining of the Employee " + year_of_joining);
    System.out.println("Salary for the Employee " + salary);
    System.out.println("Address of the Employee " + address);
    }
}

public class labQuestion3rep {
    public  static void main(String args[]){
    Employee emp = new Employee();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the name of 1st employee ");
    emp.name = sc.nextLine();
    
    System.out.println("Enter the year of joining of 1st employee ");
    emp.year_of_joining = sc.nextInt();

    System.out.println("Enter the salary of 1st employee ");
    emp.salary = sc.nextInt();
   // sc.nextLine();
    
    System.out.println("Enter the address of 1st employee ");
    emp.address = sc.nextLine();
      
    
    emp.printDetails();
    System.out.println();
    
    Employee emp2 = new Employee();
    System.out.println("Enter the name of 2nd employee ");
    emp2.name = sc.nextLine();
    
    System.out.println("Enter the year of joining of 2nd employee  ");
    emp2.year_of_joining = sc.nextInt();

    System.out.println("Enter the salary of 2nd employee  ");
    emp2.salary = sc.nextInt();
    //sc.nextLine();
    
    System.out.println("Enter the address of 2nd employee  ");
    emp2.address = sc.nextLine();
    
    emp2.printDetails();
    System.out.println();
    
    Employee emp3 = new Employee();
    System.out.println("Enter the name of 3rd employee ");
    emp3.name = sc.nextLine();
    
    System.out.println("Enter the year of joining of 3rd employee  ");
    emp3.year_of_joining = sc.nextInt();

    System.out.println("Enter the salary of 3rd employee  ");
    emp3.salary = sc.nextInt();
    // sc.nextLine();
    
    System.out.println("Enter the address of 3rd employee  ");
    emp3.address = sc.nextLine();
       
    
    emp3.printDetails();
    System.out.println();
    }
}
