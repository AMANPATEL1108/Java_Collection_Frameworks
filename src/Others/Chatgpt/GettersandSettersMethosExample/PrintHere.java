package Others.Chatgpt.GettersandSettersMethosExample;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintHere {
    static ArrayList<Person> arrayList=new ArrayList<>();
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a name:");
        String name=sc.next();
        System.out.println("Enter a age:");
        int age=sc.nextInt();
        System.out.println("Enter a address:");
        String address=sc.next();


        Person p=new Person(name,age,address);
        arrayList.add(p);

        for (Person as:arrayList){
            System.out.println(as.getName());
            System.out.println(as.getAge());
            System.out.println(as.getAddress());
        }

        System.out.println("Do You Want Update THis :\n 1.Yes  \n 2.No");
        int a=sc.nextInt();
        if (a==1){

            for (Person as:arrayList){
                System.out.println("ENter a New NAme:");
                String newname=sc.next();
                p.setName(newname);
                System.out.println("Enter a New age");
                int newage=sc.nextInt();
                p.setAge(newage);
                System.out.println("Enter a NEw Address:");
                String newaddress=sc.next();
                p.setAddress(newaddress);
            }

            System.out.println("This is Updated Data:");
            for(Person newadd:arrayList){
                System.out.println(p.getName());
                System.out.println(p.getAge());
                System.out.println(p.getAddress());
            }

        }else {
            System.out.println("Good Night");
        }

    }
}
