package practice5;
import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;
    private double area;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void calculateArea(){
        this.area = length*width;
    }

    public void displayDetails(){
        System.out.printf("Length : %.2f\n", this.length);
        System.out.printf("Width : %.2f\n", this.width);
        System.out.printf("Area : %.2f\n", this.area);
    }
}

public class Main {
    public static void main(String[] args) {
    
        // Create a Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);

        //Read th length ad width from the user as double input
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        // Create first object of rectangle class using the default constructor
        Rectangle r1 = new Rectangle();
        r1.calculateArea();
        r1.displayDetails();

        // Create second object of rectangle class using the parameterized constructor
        Rectangle r2 = new Rectangle(length, width);
        r2.calculateArea();
        r2.displayDetails();

        sc.close(); // Close the scanner
    }
}
