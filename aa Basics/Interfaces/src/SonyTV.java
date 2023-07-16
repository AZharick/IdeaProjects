public class SonyTV implements TVControl {
    int lastChannel;
    int channel;
    boolean isOn;

    SonyTV () {
        this.channel = lastChannel;
        System.out.println("\nNew Sony TV created!");
    }

    @Override
    public void turnOn() {
        isOn = true;
        this.channel = lastChannel;
        System.out.println("Turning on with channel "+channel);
        System.out.println("Screen: "+startMessage);
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Turning off...");
        System.out.println("Screen: "+shutdownMessage+"\n");
    }

    @Override
    public void setChannel(int channel) {
        if (isOn = true) {
            System.out.println("Setting channel to " + channel);
            lastChannel=channel;
        } else System.out.println("Turn TV on first!");
    }

    //GnS =================
    public int getChannel() {
        return channel;
    }
    public boolean isOn() {
        return isOn;
    }
    public void setOn(boolean on) {
        isOn = on;
    }
}
