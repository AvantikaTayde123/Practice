import java.util.Scanner;
abstract class Shape {
   abstract double calculatearea();
}

class Rectangle extends Shape{
    private float area;
    private int length;
    private int breadth;
    public double calculatearea(){
        System.out.println("Enter the length and breath of rectangle....");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        area=a*b;
        return area;
    }

}

class Circle extends Shape{
    private double pi=3.14;
    private double area;
    private int radius;
    public double calculatearea(){
        System.out.println("Enter the radius of circle....");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        area=pi*a*a;
        return area;

    }

}
class Main1{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("area of reactangle" +r.calculatearea());
        Circle c=new Circle(); 
        System.out.println("area of circle: "+c.calculatearea());
    }
}
