public class Oldman implements RelaxWDrugs {
    public int age;
    public String name;

    public Oldman (int age, String name) {
        System.out.println("СТАРИК: ЭЭэх, молодёжь!..");
        this.age = age;
        this.name = name;
    }

    @Override
    public void watchTV() {
        System.out.println(age+"-летний старик "+name+" смотрит Чародеев");
    }

    @Override
    public void playsega() {
        System.out.println(age+"-летний старик "+name+" играет в DENDY");
    }

    @Override
    public void playsynth() {
        System.out.println(age+"-летний старик "+name+" играет на синте");
    }

    @Override
    public void writepoem() {
        System.out.println(age+"-летний старик "+name+" пишет Расты");
    }
}
