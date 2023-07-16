public class Worker extends Human {
    private String profa;
    private int salary;
        //Getters n setters
    public String getProfa() {
        return profa;
    } //этот метод переопределен в классе Coder
    public void setProfa(String profa) {
        this.profa = profa;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    void myzp () {
        System.out.println("Я "+profa+" и я получаю "+salary+ " руб. в месяц");
    }
}
