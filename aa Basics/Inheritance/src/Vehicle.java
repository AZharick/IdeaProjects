public class Vehicle {
    private int TopSpeed;
    private int wheels;
    public String country;

    // КОНСТРУКТОР
    public Vehicle() {
    }

    // КОНСТРУКТОР
    Vehicle (int TopSpeed, int wheels, String country){
        this.TopSpeed=TopSpeed;
        this.wheels=wheels;
        this.country=country;
        System.out.println("*** New vehicle created");
    }

    public void displayInfo(){
        System.out.println("This vehicle's TopSpeed is "+getTopSpeed()+" with "+getWheels()+" wheels");
        System.out.println("And it's produced in "+country);
        Car c4 = new Car(220,4,"BMW", "USSR");     //МОЖНО инстанциализировать Наследника в Родителе
    }

    private void writeBad() {
        System.out.println(this.TopSpeed+" ****** CUNT DICK SHIT ******");   //private М-д
    }

    public void writeIt() {
        this.writeBad();                               //public accessor для private М-да
    }

    //GnS ======================
    public int getTopSpeed() {
        return TopSpeed;
    }
    public void setTopSpeed(int topSpeed) {
        TopSpeed = topSpeed;
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}