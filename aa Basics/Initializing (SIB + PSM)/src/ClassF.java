public class ClassF {
    // instance VAR final method initializator
    private int f = initF();

    final int initF () {                                    //запускается автоматически при создании О-та
        System.out.println("final method initializator sets F to 9999");
      return f = 9999;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
        System.out.println("Setter set F to "+f);
    }

}
