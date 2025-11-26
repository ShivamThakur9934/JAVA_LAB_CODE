import java.util.Scanner;

interface Student {
    void getDetails();
    void displayDetails();
}

interface Marks {
    void getMarks();
    void displayMarks();
}

class Result implements Student, Marks {
    private String name;
    private int rollNo;
    private int marks1, marks2, marks3;
    private int total;
    private double percentage;

    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
    }

    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }

    public void getMarks() {
        System.out.print("Enter marks for Subject 1: ");
        marks1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        marks2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        marks3 = sc.nextInt();

        total = marks1 + marks2 + marks3;
        percentage = total / 3.0;
    }

    public void displayMarks() {
        System.out.println("\n--- Marks & Result ---");
        System.out.println("Subject 1: " + marks1);
        System.out.println("Subject 2: " + marks2);
        System.out.println("Subject 3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 60)
            System.out.println("Grade: A");
        else if (percentage >= 50)
            System.out.println("Grade: B");
        else if (percentage >= 35)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F (Fail)");
    }
}

public class StudentResultSheet {
    public static void main(String[] args) {
        Result student = new Result();
        student.getDetails();
        student.getMarks();
        student.displayDetails();
        student.displayMarks();
    }
}
