// one class can impl. any q-ty of int-s
public class Boy implements Relax, Study {  //т.о. этот класс обязан иметь те же методы, что и Relax и Study
         //implements - своего рода, ПОДПИСАНИЕ КОНТРАКТА на реализацию ВСЕХ методов, указанных в И.-се
    @Override
    public void watchTV() {
        System.out.println("Boy watches Starcraft championship");
    }

    @Override
    public void playsega() {
        System.out.println("Boy plays UMK3");
    }

    @Override
    public void readbook() {
        System.out.println("Boy reads Java book");
    }

    @Override
    public void dolab() {
        System.out.println("Boy makes oscillator lab");
    }
}
