package practice2;
import java.util.Scanner;

class Student {
    public String name;
    private int rollNumber;

    public void setDetails(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Main {
    public static void main(String[] args) {
    
        // Create a Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = sc.nextLine(); // Read the name as a string input

        System.out.print("Enter student's roll number: ");
        int rollNumber = sc.nextInt(); // Read the roll number as an integer input

        // Create an object of the Student class
        Student student = new Student();

        // Set the details of the student using the setDetails() method
        student.setDetails(name, rollNumber);

        // Display the student's details using the displayDetails() method
        student.displayDetails();

        // Close the Scanner to free resources
        sc.close();
    }
}

