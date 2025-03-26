class SirenRunner {
    public static void main(String[] args) {
        Siren siren1 = new Siren();
        System.out.println("Siren 1 is a weathered emergency device from an old fire station.");
        System.out.println("Default Values:");
        System.out.println("Volume: " + siren1.volume);
        System.out.println("Type: " + siren1.type);
        System.out.println("Is Battery Powered: " + siren1.isBatteryPowered);
        System.out.println("Frequency: " + siren1.frequency);

        Siren siren2 = new Siren();
        siren2.volume = 100;
        siren2.type = "Emergency";
        siren2.isBatteryPowered = true;
        siren2.frequency = 500;
        System.out.println("\nSiren 2 is a cutting-edge warning system for urban safety.");
        System.out.println("Updated Values:");
        System.out.println("Volume: " + siren2.volume);
        System.out.println("Type: " + siren2.type);
        System.out.println("Is Battery Powered: " + siren2.isBatteryPowered);
        System.out.println("Frequency: " + siren2.frequency);
    }
}