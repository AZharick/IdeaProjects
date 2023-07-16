public class MAIN {
    public static void main(String[] args) {

        SonyTV Trinitron = new SonyTV();
        Trinitron.isOn = false;

        Trinitron.turnOn();
        Trinitron.setChannel(6);
        Trinitron.turnOff();

        Trinitron.turnOn();
        Trinitron.setChannel(10);
        Trinitron.turnOff();

        Trinitron.turnOn();

        //================================
        //TVControl control0 = new TVControl();      can't be instantiated

        //Object obj1 = new Object();
        //TVControl control1 = (TVControl) obj1;      runtime ClassCastException here

        TVControl Bravia = new SonyTV();
        Bravia.turnOn();
        Bravia.displayInfo();

        TVControl.writeShit();

        UpgradedTVControl MegaTV = new SamsungTV();
        MegaTV.turnOn();
        MegaTV.setChannel(22);
        MegaTV.volDown();
        MegaTV.turnOff();
        MegaTV.displayInfo();

    }
}
