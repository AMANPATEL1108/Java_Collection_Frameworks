package Others.PracticeHere.bsd;
import java.util.ArrayList;
import java.util.Scanner;

public class Home {

    static ArrayList<Dataget> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Users Do You Want to Insert?:");
        int a = sc.nextInt();

        Registration regis = new Registration();

        for (int i = 0; i < a; i++) {
            regis.Registration(arrayList);
        }


        for (Dataget i : arrayList) {
            System.out.println(i.getName());
            System.out.println(i.getEmail());
            System.out.println(i.getNumber());
        }
    }
}
