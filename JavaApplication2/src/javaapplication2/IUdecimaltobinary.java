
package javaapplication2;
import java.util.Scanner;
// fraz haidry
public class IUdecimaltobinary {
    public void convertion(int n,int arr[]){
        int rem;
        int i = 0;
        if(n == 0){
            System.out.println("0");
        }
        while(n!=0){
            rem = n%2;
            n = n/2;
            arr[i] = rem;
            i++;
        }
        for(int j = i-1; j>=0; j--){
            System.out.printf("%d",arr[j]);
      }
    }
    public static void main(String args[]){
      IUdecimaltobinary obj =  new IUdecimaltobinary();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the no which you want to convert ");
      int n = sc.nextInt();
       int size = n;
       int arr[];
       arr = new int[size];
      obj.convertion(n,arr);
      
    }
}
