package task.areliez.SecondTask;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Student: " + getFullName() + " CI: " + getcI() + " Years: " + getYears();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getYears() == student.getYears() &&
                Objects.equals(getFullName(), student.getFullName()) &&
                Objects.equals(getcI(), student.getcI());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getcI(), getYears());
    }
}
