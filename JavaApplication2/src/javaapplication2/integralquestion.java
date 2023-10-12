
package javaapplication2;

import java.util.Scanner;
class max{
    int n1;
    int n2;
}

public class integralquestion {
    public  int  max1(int n1, int n2){
        if(n1==n2){
            System.out.println("Equal No");
        }
        else if(n1>n2){
            System.out.printf("%d is greater than %d\n", n1, n2);
        }
         else if(n2>n1){
            System.out.printf("%d is greater than %d\n", n2, n1);
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        integralquestion obj2 = new integralquestion();
        max  obj = new max();
        
        System.out.println("Enter first No ");
        obj.n1 =sc.nextInt();
        
        
        System.out.println("Enter second No");
         obj.n2 = sc.nextInt();
         
         System.out.println(obj2.max1(obj.n1,obj.n2));
         
    }
}
    

