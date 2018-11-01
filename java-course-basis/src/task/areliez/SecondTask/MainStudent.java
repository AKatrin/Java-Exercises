package task.areliez.SecondTask;

import java.util.HashSet;

public class MainStudent {

    public static void main(String[] args) {
        Student student1 = new Student("Marcelo Flores", "5555555", (short)45);
        Student student2 = new Student("Maria Vargas", "1564566", (short)40);
        Student student3 = new Student("Carlos Rodriguez", "2222222", (short)20);
        Student student4 = new Student("Maria Vargas", "1111111", (short)21);
        Student student5 = new Student("Marcelo Flores", "5555555", (short)45);
        Student student6 = new Student("Marcelo Flores", "5555555", (short)40);

        HashSet<Student> students = new HashSet<>();

        System.out.println(students.add(student1));

        System.out.println(students.add(student2));

        System.out.println(students.add(student3));

        System.out.println( students.add(student4));

        System.out.println(students.add(student5));

        System.out.println(student1.equals(student5));

        if (!students.contains(student5)){
            students.add(student6);
            System.out.println("Student added successfully");
        }else{
            System.out.println("Exist a student with data: " + student6);
        }

    }
}
