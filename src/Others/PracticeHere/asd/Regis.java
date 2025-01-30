package Others.PracticeHere.asd;

import java.util.ArrayList;
import java.util.Scanner;

public class Regis {

    void Registration(ArrayList<Data> arrayList) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.next();

        System.out.println("Enter Email:");
        String email = sc.next();

        System.out.println("Enter Number:");
        long number = sc.nextLong();

        Data d = new Data(name, email, number);
        arrayList.add(d);
    }
}
