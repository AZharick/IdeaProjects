public class Engine {
    private int volume, cylinderQty;
    private boolean isOn;

    Engine (int v, int cyl) {
        this.volume = v;
        this.cylinderQty = cyl;
        System.out.println("Engine created!");
    }

    public void start (){
        isOn = true;
        System.out.println("Engine started!");
    }

    public void stop (){
        isOn = false;
        System.out.println("Engine stopped!");
    }

    //Gns ====================
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getCylinderQty() {
        return cylinderQty;
    }
    public void setCylinderQty(int cylinderQty) {
        this.cylinderQty = cylinderQty;
    }
    public boolean isOn() {
        return isOn;
    }
    public void setOn(boolean on) {
        isOn = on;
    }
}
