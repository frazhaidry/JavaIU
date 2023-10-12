
package javaapplication2;
import java.util.Scanner;

public class labQuestion2 {
    public static float average(float m1,float m2, float m3){
        float ag;
        ag = (m1 +m2+ m3)/3;
        return ag;
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        float m1, m2,m3;
        float avg;
        System.out.println("Enter the three number ");
        
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        
        
        avg = average(m1,m2,m3);
        System.out.println(avg);
        
    }
}
