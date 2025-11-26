import java.util.Scanner; 
class Vehicle { 
String vehicleType; 
Vehicle(String vehicleType) { 
this.vehicleType = vehicleType; 
} 
void display() { 
System.out.println("Vehicle Type: " + vehicleType); 
} 
} 
class Car extends Vehicle { 
String modelType; 
String companyName; 
Car(String vehicleType, String modelType, String companyName) { 
super(vehicleType); this.modelType = modelType; 
this.companyName = companyName; 
} 
void display() { 
super.display(); 
System.out.println("Car Model: " + modelType); 
System.out.println("Company Name: " + companyName); 
} 
} 
public class VehicleCarTest { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter vehicle type: "); 
String vehicleType = sc.nextLine(); 
System.out.print("Enter car model: "); 
String modelType = sc.nextLine(); 
System.out.print("Enter company name: "); 
String companyName = sc.nextLine(); 
Car myCar = new Car(vehicleType, modelType, companyName); 
System.out.println("\nVehicle Information:"); 
myCar.display(); 
} 
}
