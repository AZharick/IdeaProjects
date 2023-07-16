public class TEST {
    public static void main (String[] args){
        System.out.println("В строковый массив с именем args можно передать из ТЕРМИНАЛА данные");
        System.out.println("1) В терминале (который внизу слева) заходим в папку, где нах.-ся текущий класс (через команду cd);");
        System.out.println("2) Запускаем компилятор: javac TEST.java");
        System.out.println("3) Если нет ошибок, запускаем класс и передаём 2 аргумента: java TEST arg1st arg2nd");
        System.out.println(args[0] + args[1]);
    }
}
