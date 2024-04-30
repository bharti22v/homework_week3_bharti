package week_3_Homework;
/**
 * Declare 2 instance variables
 * Create 2 constructors
 * Create 5 instance method
 */

public class Wall {
    private double width;
    private double height;

    // No-argument constructor
    public Wall() {
        // Default width and height are set to 0
        this.width = 0;
        this.height = 0;
    }

    // Constructor with parameters
    public Wall(double width, double height) {
        // Initialize fields with parameter values, ensuring non-negative values
        this.width = (width < 0) ? 0 : width;
        this.height = (height < 0) ? 0 : height;
    }

    // Method to get width
    public double getWidth() {
        return width;
    }

    // Method to get height
    public double getHeight() {
        return height;
    }

    // Method to set width with parameter validation
    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    // Method to set height with parameter validation
    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }
    //Write the test code into the main method to get the desired output.
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
