package javaapplication2;
import java.util.Scanner;

//Q find whether  a number is even or odd by indirect recursion 

public class IUquestion7 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no which you want to check : ");
        int  n = sc.nextInt();
        
        boolean result = isEven(n);
        System.out.println( result);
    }
    
    static boolean isEven(int n){
        if(n==0){
            return true;
        }
        else{
            return isOdd(n-1);
        }
    }
    
    static boolean isOdd(int n){
        if(n==0){
            return false;
        }
        else{
            return isEven(n-1);
        }
    }
    
}
