package map.hashmap;

import java.util.HashMap;

public class HashCoedandEqualMethods {

    public static void main(String[] args) {
        HashMap<Person,String> map=new HashMap<>();

        Person p1=new Person("name",1);
        Person p2=new Person("Dev",2);
        Person p3=new Person("name",1);

        map.put(p1,"eng");
        map.put(p2,"des");
        map.put(p3,"manager");
    }

}


class Person{
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}