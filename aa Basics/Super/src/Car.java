public class Car extends Vehicle{
    private String CarBrand;
    int a = 9999;            //имя совп. с именем пер-й в Родителе, СКРЫВАЯ её

    Car(int mSp, int w, String br) {
        super(mSp, w);
        CarBrand = br;
        System.out.println("New "+CarBrand+" car created!");
    }

    public void writeShit (){
        System.out.println("\n**** Car's shit ****");
        super.writeShit();      // accessing overridden method
    }

    public void writeA (){
        System.out.println("\nSuperclass's A (666) = "+super.a);
        System.out.println("Subclass's A (9999) = "+a);
    }

    @Override
    public void displayInfo() {
        System.out.println("This cool "+CarBrand+" has "+getMaxSpeed()+" max speed!");
    }
}
