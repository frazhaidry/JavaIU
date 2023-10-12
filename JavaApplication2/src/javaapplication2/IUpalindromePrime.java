
package javaapplication2;
import java.util.Scanner;

public class IUpalindromePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
    }
    public  void check(int number ,int sum){
         if (isPalindrome(number) && isPrime(number)){
            System.out.println(number + " is both a palindrome and a prime number.");
        } else if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome but not a prime number.");
        } else if (isPrime(number)) {
            System.out.println(number + " is a prime number but not a palindrome.");
        } else {
            System.out.println(number + " is neither a palindrome nor a prime number.");
        }
    }

    // Method to check if a number is a palindrome
    public void  isPalindrome(int num) {
        int sum = 0;
        int c = num;

        while (num > 0) {
            int r = num % 10;
            sum = (sum * 10) + r;
            num /= 10;
        }
        
        if(c==sum){
            System.out.println("Palindrome Number ");
        }
        else {
            
            System.out.println("Not  a Palindrpme NNumber ");
        }
    }
    

    // Method to check if a number is prime
    public static void  isPrime(int n) {
       int div = 2;
        
        while(div<n){
            if(n%div == 0){
                System.out.println(" Not prime ");
                
            }
            else {
                div = div+ 1;
            }
            
        }
        System.out.println("prime No ");
    
       }
}


