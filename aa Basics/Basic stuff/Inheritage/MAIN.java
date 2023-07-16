import java.util.Scanner;
        //HUMAN-WORKER-[BENDER, CODER] ИНКАПСУЛЯЦИЯ, GETTERS SETTERS, CONSTRUCTORS, OVERLOADING\OVERRIDING methods
public class MAIN {
    public static void main(String[] args) {
        Human bomzh = new Human();
        bomzh.setName("Мехалыч");
        System.out.println("Имя бомжа - "+bomzh.getName());

        System.out.println("===============================");
        Coder Alex = new Coder("Алексей", (short) 37);
        Alex.setProfa("Хацкер");
        Alex.intro();
        Alex.myzp();

        System.out.println("ПЕРЕГРУЗКА ===============");
        Human chel = new Human(); // ЭТО БАЗОВЫЙ КОНСТРУКТОР
        chel.intro();      // вывод ПЕРЕГРУЖЕННЫХ методов
        chel.intro((int) 666);
        chel.intro((String) "Allah akbar");
    }
}
