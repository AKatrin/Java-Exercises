package task.areliez.SecondTask;

public class Student {

    private String fullName;
    private String cI;
    private short years;

    public Student(String fullName, String cI, short years) {
        this.fullName = fullName;
        this.cI = cI;
        this.years = years;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getcI() {
        return cI;
    }

    public void setcI(String cI) {
        this.cI = cI;
    }

    public short getYears() {
        return years;
    }

    public void setYears(short years) {
        this.years = years;
    }
}
