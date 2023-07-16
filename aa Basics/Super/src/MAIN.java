public class MAIN {
    public static void main(String[] args) {

        Vehicle obj1 = new Vehicle(40, 2);
        obj1.displayInfo();

        System.out.print("\n");

        Car obj2 = new Car(220,4, "Hyundai");
        obj2.displayInfo();

        obj2.writeA();

        obj1.writeShit();
        obj2.writeShit();

        System.out.print("\n");

        //test
        Vehicle obj3 = new Car(400,4,"BMW");   //т.н. расширение типа
        System.out.println(obj3.getClass());            //CAR
        obj3.displayInfo();                             //вызван М-д К-са Car
        //obj3.writeA;                              //вызываются только М-ды, опр. в Родителе!

        //Car obj4 = new Vehicle(55,3);      //несовпадение типов
        //Car obj5 = (Car) new Vehicle(55,3);    //casting to CAR - RUNTIME ERROR!!!
    }
}
