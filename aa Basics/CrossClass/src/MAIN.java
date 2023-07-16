public class MAIN {
    public static void main(String[] args) {
        Dog test1 = new Dog();

        // т.н. ПРИВЕДЕНИЕ ТИПОВ (расширение kolly до Dog):
        Dog test2 = new kolly(); //        (в VAR типа Dog сохр. ссылка на О-т типа kolly)

        //kolly test3 = new Dog();    - FAILS!

        //Animal entity = new Animal();            - запрещено создание О-в абстрактных классов!

        System.out.println("Dog test1 = new Dog:");
        test1.voice();
        System.out.println("Dog.dog to String: " + test1.toString());
        System.out.println("=============================");

        System.out.println("Dog test2 = new kolly:");
        test2.voice();                //pay attention!!!!!!!!!!!!!     (влияет тип ОБЪЕКТА!)
        System.out.println("Dog.kolly to String: "+test2.toString());
        System.out.println("=============================");

        System.out.println("test1.legs = " + test1.legs);

    }
}
