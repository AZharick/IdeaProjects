public interface TVControl {
    String startMessage = "Hello, Sony user!";
    String shutdownMessage = "Bye";

    private void myMethod(){};
    void turnOn();
    void turnOff();
    void setChannel(int channel);

    default void displayInfo() {
        System.out.println("        *SoftwareVersion: 1.0.2 beta");
    }

    static void writeShit() {
        System.out.println("SHIT SHIT SHIT SHIT");
    }
}