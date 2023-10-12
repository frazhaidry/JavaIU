
package javaapplication2;


public class integralquestion2 {
       public static void main(String args[]){
         int A[] ={1,4,5,3,6,7,3};
         int n = 7;
         for(int i =0;i<n;i++){
            A[i] += 2;
        }
         for(int i = 0; i<n; i++){
             System.out.printf("%d ",A[i]);
         }
         System.out.println();
    }    
}
