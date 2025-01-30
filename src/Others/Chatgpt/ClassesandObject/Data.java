package Others.Chatgpt.ClassesandObject;

public class Data {
    private  String name;
    private  int rollno;
    private  String grade;

    public Data(String name, int rollno,String grade) {
        this.name = name;
        this.rollno = rollno;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getGrade() {
        return grade;
    }
}
