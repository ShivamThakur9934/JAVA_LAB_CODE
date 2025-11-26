import java.util.Scanner; abstract 
class Shape { 
abstract void area(); 
} 
class Triangle extends Shape { 
private double base, height; 
Triangle(double base, double height) { 
this.base = base; 
this.height = height; 
} 
@Override 
void area() { 
double area = 0.5 
* base * height; 
System.out.println("Area of Triangle: " + area); 
} 
} 
class Rectangle extends Shape { 
private double length, width; 
Rectangle(double length, double width) { 
this.length = length; 
this.width = width; 
} 
@Override 
void area() { 
double area = length * width; 
System.out.println("Area of Rectangle: " + area); 
} 
} 
class Circle extends Shape { 
private double radius; 
Circle(double radius) { 
this.radius = radius; 
} 
@Override 
void area() { 
double area = 3.14159 * radius * radius; 
System.out.println("Area of Circle: " + area); 
} 
} 
public class ShapeTest { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.println("=== Triangle ==="); 
System.out.print("Enter base: "); 
double base = sc.nextDouble(); 
System.out.print("Enter height: "); 
double height = sc.nextDouble(); 
Shape t = new Triangle(base, height); 
t.area(); 
System.out.println("\n=== Rectangle ==="); 
System.out.print("Enter length: "); 
double length = sc.nextDouble(); 
System.out.print("Enter width: "); 
double width = sc.nextDouble(); 
Shape r = new Rectangle(length, width); 
r.area(); 
System.out.println("\n=== Circle ==="); 
System.out.print("Enter radius: "); 
double radius = sc.nextDouble(); 
Shape c = new Circle(radius); 
c.area(); 
} 
} 
