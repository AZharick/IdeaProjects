class Car {
    String color;
}

public class MAIN {
    public static void main(String[] args) {

        Car Creta, Tucson;
        Creta = new Car();
        Tucson = new Car();

        Creta.color="WHITE";
        System.out.println("Creta's color = "+Creta.color);     //White
        Tucson.color="BLUE";
        System.out.println("Tucson's color = "+Tucson.color);   //Blue

        Creta = Tucson;                                              //две пер-е ссылаются на один О-т
        //если было бы "final Car Creta", то "Creta = Tucson" не проканало бы
        System.out.println("Creta = Tucson");

        System.out.println("Creta's color = "+Creta.color);     //Blue
        System.out.println("Tucson's color = "+Tucson.color);   //Blue
        Creta.color="RED";
        System.out.println("Creta's color changed to RED");
        System.out.println("Creta's color = "+Creta.color);     //red
        System.out.println("Tucson's color = "+Tucson.color);   //red
    }
}