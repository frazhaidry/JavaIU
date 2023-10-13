
package javaapplication2;
import java.util.Scanner;

class TwinPrime{
      public Boolean isPrime(int num){
          int div =2;
          while(div<num){
              if(num%div==0){
                  return false;
              }
              div = div + 1;
          }
          return true;
//          if(num<=1){
//              return false;
//          }
          
//          else{
//              for(int i = 2;i* i <= num; i++){
//                  if(num % i == 0){
//                      return false;
//                  }
//              }
//              return true;
//          }
      } 
      public void show(int n){
          for(int i = 2;  i<=n-2;  i++){
              if(isPrime(i) && isPrime(i + 2)){
                  //System.out.println((i) + " " + (i+2));
                  System.out.println("(" + i + ", " + (i + 2) + ")");
              }
          }
      }
}

public class IUtwinPrime {
    
  public static void main(String args[]){
      
      Scanner sc = new Scanner(System.in);
      TwinPrime TP = new TwinPrime();
      
      System.out.println("enter the range : ");
      int r = sc.nextInt();
      
      Boolean b = TP.isPrime(r);
      System.out.println(b);
      
      TP.show(r);
  }
}
