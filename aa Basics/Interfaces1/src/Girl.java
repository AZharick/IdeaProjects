// one Class can impl. any q-ty of Int-s
public class Girl implements Relax, Study {   //т.о. этот класс обязан иметь те же методы, что и Player
    //implements - своего рода, ПОДПИСАНИЕ КОНТРАКТА на реализацию ВСЕХ методов, указанных в И.-се
    @Override
    public void watchTV() {
        System.out.println("Girl watches Twilight");
    }

    @Override
    public void playsega() {
        System.out.println("Girl plays Ms. Pacman");
    }

    @Override
    public void readbook() {
        System.out.println("Girl reads and studies accouncy book");
    }

    @Override
    public void dolab() {
        System.out.println("Girl checks trading manifests");
    }
}
