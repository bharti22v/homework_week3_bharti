package week_3_Homework;

/**
 * Create Instance methods defined public.
 */

public class Person {

    public String firstName;
    public String lastName;
    public int age;

    // Method to get first name
    public String getFirstName() {
        return firstName;
    }

    // Method to get last name
    public String getLastName() {
        return lastName;
    }

    // Method to get age
    public int getAge() {
        return age;
    }

    // Method to set first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Method to set last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method to set age with parameter validation
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Method to check if person is a teen
    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    // Method to get full name
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }

    //write the test code into the main method to check the output.
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }
}