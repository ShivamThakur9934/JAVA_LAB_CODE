import java.util.Scanner; 
public class DecimalToBinary { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter a decimal number: "); 
int decimal = sc.nextInt(); 
String binary = ""; 
int num = decimal; 
while (num > 0) { 
int remainder = num % 2; 
binary = remainder + binary; 
num = num / 2; 
} 
if (decimal == 0) { 
binary = "0"; 
} 
System.out.println("Binary representation of " + decimal + " is: " + binary); 
} 
} 
