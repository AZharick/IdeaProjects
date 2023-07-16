public class Human {
    private short age;
    private String skinclr, name, lastname, country;
    //Getters n Setters
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public short getAge() {
        return age;
    }
    public void setAge(short age) {
        this.age = age;
    }
    public String getSkinclr() {
        return skinclr;
    }
    public void setSkinclr(String skinclr) {
        this.skinclr = skinclr;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    //ПЕРВЫЙ метод
    public void intro() {
        System.out.println("Привет, я "+skinclr+" "+lastname+" "+name+" из "+country+", мне "+age+" лет");
    }
    //нижеследующие 2 метода являются ПЕРЕГРУЖЕННЫМИ по отношению к ПЕРВОМУ методу
    //ПЕРЕГР-Й М. = М. с изм-й сигнатурой (С. = имя + список пар-ров)
    public void intro (int digit) {
        System.out.println((digit) + " ZDARROVA, я "+skinclr+" "+lastname+" "+name+" из "+country+", мне "+age+" лет");
    }
    public void intro (String greet) {
        System.out.println(greet + ", я "+skinclr+" "+lastname+" "+name+" из "+country+", мне "+age+" лет");
    }
}
