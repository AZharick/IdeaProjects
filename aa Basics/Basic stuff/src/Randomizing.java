public class Randomizing {
    //РАНДОМИЗАЦИЯ, ОКРУГЛЕНИЕ ДРОБНЫХ
    public static void main(String[] args) {
        float a = (float) Math.random();
        float b = (float) Math.random();
        float c = (float) Math.random();
        double d = 34.123456;
        System.out.println("Рандомныя дробныя ==================================");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Генерация целых от 1 до 10 ===============");
        System.out.println("a = " + Math.round(a*10));
        System.out.println("b = " + Math.round(b*10));
        System.out.println("c = " + Math.round(c*10));
        System.out.println("Генерация целых от 1 до 100 ===============");
        System.out.println("a = " + Math.round(a*100));
        System.out.println("b = " + Math.round(b*100));
        System.out.println("c = " + Math.round(c*100));
    }

    // напиши рандомизатор символов!
}