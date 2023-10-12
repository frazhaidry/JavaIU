
package javaapplication2;

//fraz haidry
public class IUautomorphicno {
    public static void main(String args[]){
        System.out.println(isAutomorphicNo(5));
        
    }
        
        public static boolean isAutomorphicNo(int n){
        // calculate square of the no
        int square  = (int) Math.pow(n ,2);
        
        while(n>0){
              int nDigit = n%10;
              
              int sqDigit = n%10;
              
              
              if(nDigit == sqDigit){
                  n = n/ 10;
                  square = square / 10;
              }
              else{
                  return false;
              }
        }
        return true;
        }
    }
    

