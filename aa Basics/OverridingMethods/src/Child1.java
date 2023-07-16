public class Child1 extends Parent {

    // FIRST M.
    public void ololo (int a) {       //АРГУМЕНТ передается, ПАРАМЕТР используется (А. превращается в П.)
        System.out.println("I CHILD "+a+" YEARS OLD");
    }

    // this M. overloads FIRST M. cause of modified signature of M. (int. turns to String)
    public void ololo (String chant) {
        System.out.println("YAMA I'MA CHILDA "+chant);
    }
}