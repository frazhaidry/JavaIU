
package javaapplication2;

import java.util.Scanner;
// fraz haidry
import java.lang.Math;
public class IUbinarytodecimal {
    
     public void convertion(int bin){
         int i = 0;
         double sum = 0;
         while(bin!=0){
             sum= sum + Math.pow(2,i)*(bin%10);
             bin = bin/ 10;
             i++;
         }
         System.out.print(sum);
     }
     
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
      System.out.println("Enter the binary no which you want to convert ");
      int bin = sc.nextInt();
      
      IUbinarytodecimal obj = new IUbinarytodecimal();
      obj.convertion(bin);
     
}
}
