class PatientRunner {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        System.out.println("Patient 1 is a medical record in the hospital's administrative system.");
        System.out.println("Default Values:");
        System.out.println("Name: " + patient1.name);
        System.out.println("Age: " + patient1.age);
        System.out.println("Disease: " + patient1.disease);
        System.out.println("Is Admitted: " + patient1.isAdmitted);

        Patient patient2 = new Patient();
        patient2.name = "John Doe";
        patient2.age = 45;
        patient2.disease = "Pneumonia";
        patient2.isAdmitted = true;
        System.out.println("\nPatient 2 is a recovering patient in the intensive care unit.");
        System.out.println("Updated Values:");
        System.out.println("Name: " + patient2.name);
        System.out.println("Age: " + patient2.age);
        System.out.println("Disease: " + patient2.disease);
        System.out.println("Is Admitted: " + patient2.isAdmitted);
    }
}