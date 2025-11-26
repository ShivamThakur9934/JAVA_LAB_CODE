import java.util.Scanner;

class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        Student s1 = new Student(name, age);
        s1.display();
    }
}
