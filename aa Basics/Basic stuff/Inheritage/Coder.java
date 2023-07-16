public class Coder extends Worker {
    private String level;
    private short office;
    //CONSTRUCTOR для того, чтобы при создании класса сразу передавать ему пар-ры (К-р = М,создающий объект)
    public Coder (String name, short age) {
        setName(name);
        setAge(age);
    }

    @Override      //OVERRIDDEN M.
    void myzp () {
        System.out.println("I'm a software developer and my salary is 6666");
    }

    //Getters n setters
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public short getOffice() {
        return office;
    }
    public void setOffice(short office) {
        this.office = office;
    }

}
