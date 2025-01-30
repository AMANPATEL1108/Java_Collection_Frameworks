package Others.PracticeHere.bsd;

import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    void Registration(ArrayList<Dataget> arrayList) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.next();

        System.out.println("Enter Email:");
        String email = sc.next();

        System.out.println("Enter Number:");
        long number = sc.nextLong();

        Dataget d = new Dataget(name, email, number);
        arrayList.add(d);
    }
}
