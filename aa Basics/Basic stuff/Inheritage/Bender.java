public class Bender extends Worker {
    private short workshop, teamnum, grade;
    //getters n setters
    public short getWorkshop() {
        return workshop;
    }
    public void setWorkshop(short workshop) {
        this.workshop = workshop;
    }
    public short getTeamnum() {
        return teamnum;
    }
    public void setTeamnum(short teamnum) {
        this.teamnum = teamnum;
    }
    public short getGrade() {
        return grade;
    }
    public void setGrade(short grade) {
        this.grade = grade;
    }

    public void specs() {
        System.out.println("У меня "+grade+" разряд, и я работаю в "+teamnum+"-й бригаде "+workshop+"-го цеха!");
    }
}
