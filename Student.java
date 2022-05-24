import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private  int grade;

    private String[] first = {"Barry", "Gary", "Eric", "Jason", "Neil", "Dennis", "Jacob"};
    private String[] last = {"Jonas", "Lewis", "McElrea", "Brewer", "Fagan", "Bergkamp", "Henry", "Abott"};

    public Student(){
        id = (int)(10000 + Math.random() * 90000);
        int randomF = (int)(Math.random()*first.length);
        int randomL = (int)(Math.random()*last.length);
        name = first[randomF] + " " + last[randomL];
        grade = (int)(9 + Math.random()*4);
    }

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return id + " " + name +
                "(" + grade + ")";
    }
}
