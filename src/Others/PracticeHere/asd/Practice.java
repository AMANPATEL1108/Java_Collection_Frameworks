package Others.PracticeHere.asd;
import java.util.ArrayList;
import java.util.Scanner;

public class Practice {

    static ArrayList<Data> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Users Do You Want to Insert?:");
        int a = sc.nextInt();

        Regis regis = new Regis();

        for (int i = 0; i < a; i++) {
            regis.Registration(arrayList);
        }


        for (Data i : arrayList) {
            System.out.println(i.getName());
            System.out.println(i.getEmail());
            System.out.println(i.getNumber());
        }
    }
}
