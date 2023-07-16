public class MAIN {
    public static void main(String[] args) {

        Vehicle obj1 = new Vehicle();
        System.out.println("Vehicle obj1 = new Vehicle()");
        System.out.println("getClass: "+obj1.getClass());
        if (obj1 instanceof Vehicle) {
            System.out.println("obj1 instanceof Vehicle");     //TRUE
        }
        if (obj1 instanceof Car) {
            System.out.println("obj1 instanceof Car");
        }

        System.out.print("\n");

        Car obj2 = new Car();
        System.out.println("Car obj2 = new Car()");
        System.out.println("getClass: "+obj2.getClass());
        if (obj2 instanceof Vehicle) {
            System.out.println("obj2 instanceof Vehicle");     //TRUE
        }
        if (obj2 instanceof Car) {
            System.out.println("obj2 instanceof Car");     //TRUE
        }

        System.out.print("\n");

        Vehicle obj3 = new Car();
        System.out.println("Vehicle obj3 = new Car()");
        System.out.println("getClass: "+obj3.getClass());
        if (obj3 instanceof Vehicle) {
            System.out.println("obj3 instanceof Vehicle");     //TRUE
        }
        if (obj3 instanceof Car) {
            System.out.println("obj3 instanceof Car");     //TRUE
        }

        System.out.print("\n");

        //Car obj5 = (Car) obj1;  //runtime .ClassCastException: class Vehicle cannot be cast to class Car
        //ClassCastException в случае попытки приведения к типу Car О-та, ссыл.-ся на Vehicle
        Car obj6 = (Car) obj2;
        Car obj4 = (Car) obj3;
        System.out.println("Car obj4 = (Car) obj3");
        System.out.println("getClass: "+obj4.getClass());
        if (obj4 instanceof Vehicle) {
            System.out.println("obj4 instanceof Vehicle");
        }
        if (obj4 instanceof Car) {
            System.out.println("obj4 instanceof Car");
        }
    }
}
