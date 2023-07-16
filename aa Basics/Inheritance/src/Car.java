public class Car extends Vehicle {
    private String CarBrand;

    Car (){
    }

    // КОНСТРУКТОР
    Car(int TopSpeed, int wheels, String CarBrand, String country) {
        //здесь неявно вызывается default-К-р Родителя
        this.setTopSpeed(TopSpeed);                              //private fields устан только чз сеттеры
        this.setWheels(wheels);                                  //private fields устан только чз сеттеры
        this.setCarBrand(CarBrand);                              //private fields устан только чз сеттеры
        this.country = country;                                  //public напрямую
        System.out.println("*** New car created");
    }

    public void displayInfo(){
        System.out.println("This "+getCarBrand()+"'s TopSpeed is "+getTopSpeed()+ " with "+getWheels()+" wheels");
        System.out.println("And it's produced in "+country);
        //Vehicle v4 = new Vehicle(123, 4, "Germany");       // МОЖНО инстанциализировать Родителя в Наследнике
    }

    public void writeSuperBad() {
         this.writeIt();          //доступ к private-М-ду Родителя через М-д-accessor
    }

    //GnS ============================
    public String getCarBrand() {
        return CarBrand;
    }
    public void setCarBrand(String carBrand) {
        CarBrand = carBrand;
    }

}