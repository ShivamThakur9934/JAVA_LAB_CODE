class Demo { 
private int value; 
private static int count = 0; 
Demo(int value) { 
this.value = value; 
count++; 
} 
void display() { 
System.out.println("Value: " + this.value); 
} 
static void showCount() { 
System.out.println("Total objects created: " + count); 
} 
} 
public class ThisStaticExample { 
public static void main(String[] args) { 
Demo obj1 = new Demo(10); 
Demo obj2 = new Demo(20); 
Demo obj3 = new Demo(30); 
obj1.display(); 
obj2.display(); 
obj3.display(); 
Demo.showCount(); 
} 
}
