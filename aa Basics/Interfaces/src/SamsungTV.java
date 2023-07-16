public class SamsungTV extends SonyTV implements UpgradedTVControl {

    @Override
    public void volUp() {
        System.out.println("LOUDER");
    }

    @Override
    public void volDown() {
        System.out.println("QUIET");
    }


}
