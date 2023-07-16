public class MAIN {

    // СМ. ТЖ. Edu - InheritingOuterClass
    // СМ. ТЖ. Edu - InheritingSNC
    // СМ. ТЖ. Edu - Super

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.setTopSpeed(60);
        v1.setWheels(2);
        v1.setCountry("DPRK");
        v1.displayInfo();
        v1.writeIt();

        Car c1 = new Car();
        c1.setCarBrand("Hyundai");
        c1.setTopSpeed(160);
        c1.setWheels(4);
        c1.setCountry("Korea");
        c1.displayInfo();
        c1.writeIt();

        System.out.println("\n==== Thru parameterized Constructors: ====");
        Vehicle v3 = new Vehicle(200,2, "USA");
        v3.displayInfo();
        v3.writeIt();

        Car c3 = new Car(220,4, "BMW","USSR");
        c3.displayInfo();
        c3.writeIt();


        System.out.print("\n");

        OuterClass obj1 = new OuterClass();
        obj1.writeOuter();
        OuterClass.InnerClass1 obj2 = new OuterClass().new InnerClass1();
        obj2.writeOuter();
        OuterClass.InnerClass2 obj3 = new OuterClass().new InnerClass2();
        obj3.writeOuter();

        AnotherClass1.writeOuter();
        AnotherClass1 obj4 = new AnotherClass1();
        obj4.writeOuterStatic();

        AnotherClass2 obj6 = new AnotherClass2();
        obj6.writeOuter();
    }
}