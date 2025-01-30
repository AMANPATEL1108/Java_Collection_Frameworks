package Others.PracticeHere.bsd;

public class Dataget {
    private String name;
    private  String email;
    private long  number;

    public String getName() {
        return name;
    }

    public Dataget(String name, String email, long number) {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public long getNumber() {
        return number;
    }
}
