
package javaapplication2;

class Triangle{
    int base;
    int height;
    int length;
    
    public Triangle(int height,int length){
        this.base = 4;
        this.height = height;
        this.length = length;
    }
    public int area(){
        int area;
        area = (height * base)/2;
        return area;
    }
    
    public int perimeter(){
        int perimeter;
        perimeter = base + height + length; 
        return perimeter;
    }
    
    
}
public class labQuestion4 {
    public static void main(String args[]){
        Triangle ar = new Triangle(3,5);
        int area_of_triangle = ar.area();
        int perimeter_of_triangle = ar.perimeter();
        System.out.println("area of a triangle is : " + area_of_triangle);
        System.out.println("perimeter of a triangle is : " + perimeter_of_triangle);
        
    }
    
}
