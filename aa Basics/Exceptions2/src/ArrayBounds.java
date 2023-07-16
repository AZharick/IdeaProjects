public class ArrayBounds {
    public static void ArrayShit (int i) {
        System.out.println("ArrayIndexOutOfBounds ============");
        System.out.println("Всего в массиве 5 ячеек");
        int [] digs = new int[i];
        try {
            digs[i+1] = 44;
        } catch (ArrayIndexOutOfBoundsException ex2) {
            System.out.println("Обнаружена попытка изменить "+(i+1)+"-й элемент массива...");
            System.out.println("Ячейки с таким номером в массиве нет!");
        }
        finally {
            System.out.println("FINALLY: *** Конец обработки массива *** \n");
        }
    }
}
