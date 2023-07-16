public class Car extends Vehicle {      //IS-A
    private int maxSpeed;
    private Engine eng1;     //HAS-A

    Car (int spd, Engine engine){
        this.maxSpeed=spd;
        this.eng1 = engine;
    }

    public void drive() {
        System.out.println("Starting movement!");
    }

}