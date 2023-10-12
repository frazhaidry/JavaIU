
package javaapplication2;
import java.util.Scanner;

public class labQuestion8 {
     int side;
    int l , b, h;
    float  rad;
    
    
    public int volume(int side){
        System.out.print("volume of a cube is : ");
        return side*side*side;
    }
    
    public double volume(int l, int b, int h){
        System.out.print("volume of a cuboid  is : ");
        return l*b*h;
    }
    
    public double  volume(float   rad){
        System.out.print("volume of a sphere is : ");
        return (4 * 3.14 * rad *rad *rad)/3;
    }
    
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
       IUmethodoverl obj = new IUmethodoverl();
       
       System.out.println("Enter side of the cube" );
       obj.side = sc.nextInt();
       
       int  cube = obj.volume(obj.side);
       System.out.println(cube);
       
       System.out.println("Enter length breadth and height  of the cubuoid " );
       obj.l = sc.nextInt();
       obj.b = sc.nextInt();
       obj.h = sc.nextInt();
        double cuboid = obj.volume(obj.l,obj.b,obj.h);
        System.out.println(cuboid);
        
        
        System.out.println("Enter radius for the sphere  " );
        obj.rad = sc.nextFloat();
        double sphere = obj.volume(obj.rad);
        System.out.println(sphere);
        
    
        
    }
    
    
}
