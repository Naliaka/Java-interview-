import java.util.Stack;
import java.util.HashMap;
import java.util.Arrays;

public class main {
    public static void main( String[] args){
        MathTeacher mathTeacher = new MathTeacher(numberOfStudents:30,
        school: "clear Lake high School", favoriteNumber:6);

        System.out.println(mathTeacher.numberOfStudents);
        System.out.println(mathTeacher.school);
        System.out.println(mathTeacher.favouriteNumber);
        System.out.println(mathTeacher.getRole());

        Teacher teacher = new Teacher (numberOfStudents:400,
           school:"Eagle 43 High School");

        System.out.println(Teacher.numberOfStudents);
        System.out.println(Teacher.school);
        System.out.println(Teacher.getRole());

    }
}
