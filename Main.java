import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.PrimitiveIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList <Student> students = new ArrayList<>();
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());

        printArrayList(students);
        System.out.println("__________________");
        removeEveryoneAtGrade(students,9);
        printArrayList(students);

    }

    public static void printArrayList(ArrayList<Student> arr) {
        ListIterator<Student> iter = arr.listIterator();
        while(iter.hasNext()) {
            Student s = iter.next();
            System.out.println(s);
        }
    }

    public static void removeEveryoneAtGrade(ArrayList<Student> arr, int grade) {
        //use a while loop and a ListIterator
        ListIterator<Student> iter = arr.listIterator();
        while(iter.hasNext()) {
            Student currentStudent = iter.next();
            if(currentStudent.getGrade() == grade) {
                iter.remove();
            }
        }
    }
}
