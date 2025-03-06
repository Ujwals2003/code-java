public class Array{
    public static void main(String[] args) {
        
        StudentData students = new StudentData();
        System.out.println("Number of students: " + students.names.length);
        System.out.println("First Student: " + students.names[0] + ", Roll No: " + students.rollNumbers[0] + ", Marks: " + students.marks[0]);
        

        EmployeeData employees = new EmployeeData();
        System.out.println("Number of employees: " + employees.names.length);
        System.out.println("First Employee: " + employees.names[0] + ", ID: " + employees.ids[0] + ", Salary: " + employees.salaries[0]);
        
        
        CarData cars = new CarData();
        System.out.println("Number of car models: " + cars.models.length);
        System.out.println("First Car Model: " + cars.models[0] + ", Price: $" + cars.prices[0] + ", Mileage: " + cars.mileages[0] + " kmpl");
    }
}

class StudentData {
    String[] names = {"ujwal", "harsha", "ravi"};
    int[] rollNumbers = {057, 020, 011};
    double[] marks = {85.5, 90.2, 78.9};
    char[] grades = {'A', 'B', 'C'};
    boolean[] passed = {true, true, false};
    float[] percentages = {85.5f, 90.2f, 78.9f};
    long[] contactNumbers = {9876543210L, 8765432109L, 7654321098L};
    short[] attendance = {90, 85, 80};
}

class EmployeeData {
    String[] names = {"ujwal", "harsha", "ravi"};
    int[] ids = {201, 202, 203};
    double[] salaries = {50000.5, 60000.75, 45000.25};
    boolean[] isPermanent = {true, false, true};
    char[] ratings = {'A', 'B', 'A'};
    long[] phoneNumbers = {9988776655L, 8877665544L, 7766554433L};
    short[] workExperience = {5, 3, 2};
    byte[] leavesTaken = {10, 5, 8};
}

class CarData {
    String[] models = {"Tesla", "BMW", "Audi"};
    int[] prices = {60000, 75000, 80000};
    double[] mileages = {15.5, 12.8, 14.0};
    boolean[] isElectric = {true, false, false};
    char[] fuelTypes = {'E', 'P', 'D'};
    short[] topSpeeds = {200, 220, 240};
    long[] chassisNumbers = {112233445566L, 223344556677L, 334455667788L};
    byte[] seats = {5, 4, 4};
}