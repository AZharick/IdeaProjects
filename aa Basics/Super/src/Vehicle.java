public class Vehicle {
    private int maxSpeed, wheels;
    int a = 666;

//    Vehicle() {
//    }

    Vehicle(int mSp, int w) {
        maxSpeed = mSp;
        wheels = w;
        System.out.println("New "+wheels+"-wheeled vehicle created!");
    }

    public void writeShit (){
        System.out.println("\n**** Vehicle's shit ****");
    }

    public void displayInfo () {
        System.out.println("This vehicle has "+wheels+" wheels and "+maxSpeed+" max speed");
    }

    //GnS ==========================
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
