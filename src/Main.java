import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher peeter = new Teacher(2, "Peeter", 700);
        Teacher mellisa = new Teacher(3, "Mellisa", 900);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(lizzy);
        teachers.add(peeter);
        teachers.add(mellisa);

        Student tom = new Student(1, "Tom", 1);
        Student jerry = new Student(2, "Jerry", 3);
        Student chip = new Student(3, "Chip", 4);

        List<Student> students = new ArrayList<>();
        students.add(tom);
        students.add(jerry);
        students.add(chip);

        School school = new School(teachers, students);
        System.out.println("School has earned $" + school.getTotalMoneyEarned());

        tom.payFees(5000);
        System.out.println("School has earned $" + school.getTotalMoneyEarned());
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("School has spent for salary to " + lizzy.getName() +
                " and now have $" + school.getTotalMoneyEarned());
    }
}
