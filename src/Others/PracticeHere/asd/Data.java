package Others.PracticeHere.asd;

public class Data {
    private String name;
    private  String email;
    private long  number;

    public String getName() {
        return name;
    }

    public Data(String name, String email, long number) {
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
