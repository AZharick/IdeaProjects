public class MAIN {
    public static void main(String[] args) {
        // О-ты Наследника можно присваивать пер-м Родителя.
        // При этом в случае вызова переопределенных методов будут вызываться методы Наследника.
        // Однако набор допустимых для вызова методов определяется родительским классом, то есть типом переменной.

        Vehicle obj0 = new Vehicle();
        System.out.println("Veh-Veh: "+obj0.getClass());    //class Vehicle
        obj0.writeShit();
        obj0.writeVeh();
        //obj0.writeCar();

        System.out.print("\n");

        Vehicle creta = new Car();  // implicit casting - Неявное приведение
        System.out.println("Veh-Car: "+creta.getClass());    //class Car
        creta.writeShit();
        creta.writeVeh();
        //obj1.writeCar();

        System.out.print("\n");

        Car obj2 = new Car();
        System.out.println("Car-Car: "+obj2.getClass());    //class Car
        obj2.writeShit();
        obj2.writeVeh();
        obj2.writeCar();

        System.out.print("\n");

        Vehicle obj3 = creta;
        System.out.println("Veh=classCar: "+obj3.getClass());   //class Car
        obj3.writeShit();
        obj3.writeVeh();
        //obj3.writeCar();

        System.out.print("\n");

        //Car obj4 = new Vehicle();    //req. type Car, provided Vehicle
        //Car obj4 = creta;            //req. type Car, provided Vehicle
        Car obj4 = (Car) creta;        // explicit casting, inserts a forced runtime check that creta is assigned a Car
        System.out.println("Car=classCar: "+obj4.getClass());   //class Car
        obj4.writeShit();
        obj4.writeVeh();
        obj4.writeCar();

        if (creta instanceof Car){
            System.out.println("Creta's an instance of CAR");
        }
        if (creta instanceof Vehicle){
            System.out.println("Creta's an instance of VEHICLE");
        }
    }
}
