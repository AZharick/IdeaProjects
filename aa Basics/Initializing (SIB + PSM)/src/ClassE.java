public class ClassE {
    //instance VAR initialization block
    private int e;

    {
        e=333;
        System.out.println("{} instVAR initializer set e to "+e);
    }

    public int getE() {
        return e;
    }
    public void setE(int e) {
        this.e = e;
        System.out.println("Setter set E to "+e);
    }
}
