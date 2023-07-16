public class Book {
    private int year;
    private int[] digits;

    //GnS ===================
    // ОБЫЧНЫЕ ПРИМИТИВНЫЕ GnS
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    //ОШИБКА №3 ВОЗВРАТ ГЕТТЕРОМ ССЫЛКИ НА О-Т

//    public int[] getDigits() {                          //обычный геттер
//        return digits;                                  // косячная прямая передача
//    }

    public int[] getDigits() {                            //исправленный геттер
        int[] copy = new int[digits.length];              //создание пустого массива
        System.arraycopy(digits, 0, copy, 0, copy.length);   //копирование эл-тов массива
        return copy;
    }


    // ОШИБКА №2 ПЕРЕДАЧА В СЕТТЕР ПРЯМОЙ ССЫЛКИ НА О-т ============================
//    public void setDigits(int[] digits) {             //обычный сеттер
//        this.digits = digits;                         // косячная прямая передача
//    }

    public void setDigits (int[] digits) {              //исправленный сеттер
        this.digits = new int[digits.length];           //создание пустого массива
        System.arraycopy(digits, 0, this.digits, 0, digits.length);     //копирование эл-тов массива
    }

    public void displayDigits() {
        for (int number : digits) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

}
