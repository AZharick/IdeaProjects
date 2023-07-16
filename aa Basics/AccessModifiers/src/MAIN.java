// public, protected, default, private - ACCESS MODIFIERS в порядке понижения доступа
// public - доступ к классу, методу или полю в любом месте в пределах ПРОЕКТА
// private - доступ к К, М или П только в пределах того КЛАССА, где он задекларирован
// default - например, "int age = 5", доступ в пределах ПАКЕТА (package-level)
// protected - более свободен, чем default. Доступ в пределах ПАКЕТА и вне его, если вызывается из класса,
//             унаследованного от того, где он задекларирован


//Класс может быть только public или default
//Поля классов почти всегда private (инкапсуляция). Исключение - константы

import Pack1.Person;

public class MAIN {     // "Корневой" класс должен быть обязательно public (по крайней мере, в ранних версиях Java)
                        // Нет смысла закрывать к классу доступ private-ом, если к нему нельзя обратиться извне
    public static void main(String[] args) {
        Person man = new Person();
        man.name = "John Connor";
        System.out.println(man.name);
        //man.race;        доступа к приватному полю нет
        Girl Sarah = new Girl();
        //Sarah.age;      отсюда доступа к protected-полю нет
    }
}

//public class Class4{};     двух публичных в одном классе быть не может
class Class2{};             //а не публичные быть могут
class Class3{};
