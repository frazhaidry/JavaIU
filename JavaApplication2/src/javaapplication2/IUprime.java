
package javaapplication2;
import java.util.Scanner;
// fraz haidry
public class IUprime {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no ");
        
        // n is the no enter by the user 
        int n = sc.nextInt();
        
        // div is the gateway to check 
        int div = 2;
        
        // if the div is less than n(given no) then only code will execute 
       // n = 4
       // n = 3
       // n = 5
       while(div<n){// true // true // false 
            if(n%div == 0){ // 4%2 == 0? yes // 3%2 ==0? No
                // print Not prime 
                System.out.println(" Not prime ");
                
         }
            else {
                // 2 = 2 + 1;
                div = div+ 1;
         }
        }
        // is prime print 
        System.out.println("prime No ");
    }
    
}
