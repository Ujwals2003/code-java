public class Array1 {
    public static void main(String[] args) {
        
        StudentData students = new StudentData();
        System.out.println("THE STUDENT DETAILS ARE:");
        System.out.println("Number of students: " + students.names.length);
        for(int i = 0; i < students.names.length; i++) {
            System.out.println("Student " + (i+1) + ": " + students.names[i] + 
                               ", Roll No: " + students.rollNumbers[i] + 
                               ", Marks: " + students.marks[i] +
                               ", Grade: " + students.grades[i] +
                               ", Passed: " + students.passed[i] +
                               ", Percentage: " + students.percentages[i] +
                               ", Contact: " + students.contactNumbers[i] +
                               ", Attendance: " + students.attendance[i]);
        }
        
        EmployeeData employees = new EmployeeData();
        System.out.println("\nTHE EMPLOYER DETAILS ARE:");
        System.out.println("Number of employees: " + employees.names.length);
        for(int i = 0; i < employees.names.length; i++) {
            System.out.println("Employee " + (i+1) + ": " + employees.names[i] + 
                               ", ID: " + employees.ids[i] + 
                               ", Salary: " + employees.salaries[i] +
                               ", Permanent: " + employees.isPermanent[i] +
                               ", Rating: " + employees.ratings[i] +
                               ", Phone: " + employees.phoneNumbers[i] +
                               ", Experience: " + employees.workExperience[i] + " years" +
                               ", Leaves: " + employees.leavesTaken[i]);
        }
        
        CarData cars = new CarData();
        System.out.println("\nTHE DETAILS OF CAR IS:");
        System.out.println("Number of car models: " + cars.models.length);
        for(int i = 0; i < cars.models.length; i++) {
            System.out.println("Car " + (i+1) + ": " + cars.models[i] + 
                               ", Price: $" + cars.prices[i] + 
                               ", Mileage: " + cars.mileages[i] + " kmpl" +
                               ", Electric: " + cars.isElectric[i] +
                               ", Fuel Type: " + cars.fuelTypes[i] +
                               ", Top Speed: " + cars.topSpeeds[i] + " km/h" +
                               ", Chassis No: " + cars.chassisNumbers[i] +
                               ", Seats: " + cars.seats[i]);
        }
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