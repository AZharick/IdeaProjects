public class GrandChild2 extends Child1 {

    public GrandChild2(){             //ПАРАМЕТРИЗОВАННЫЙ К-Р, тело вызывается сразу при создании О-та
        System.out.println("GrandChild2 is BORN!!");
    }

    @Override
    public void ololo(String chant) {
        super.ololo(chant);
    }
}
