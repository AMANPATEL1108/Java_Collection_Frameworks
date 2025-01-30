package Others.Chatgpt.ClassesandObject;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {



    public static void main(String[] args) {

        ArrayList<Data>  arrayList=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("How many Order want to Enter:");
        int e=sc.nextInt();

        for(int i=0;i<e;i++){
            System.out.println("Enter EnNo:");
            int en=sc.nextInt();
            System.out.println("Enter Name:");
            String name=sc.next();
            System.out.println("Enter Grade:");
            String grade=sc.next();

            System.out.println("Herr");

            Data d=new Data(name,en,grade);
            arrayList.add(d);

        }

        System.out.println("Everything is Ok");

      for(Data i:arrayList){
          System.out.println(i.getRollno());
          System.out.println(i.getName());
          System.out.println(i.getGrade());
      }




    }



}
