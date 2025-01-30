package Others.EncapsulationExaxmple;

import java.util.ArrayList;
import java.util.Scanner;

public class First {

    static ArrayList<Second> newarr=new ArrayList<>();

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number How Many USers You want to Add");
            int noofusers=sc.nextInt();

        for(int i=0;i<noofusers;i++){
            System.out.println("ENter a Name");
            String name=sc.next();

            System.out.println("Enter Email");
            String  email= sc.next();

            Second s=new Second(name,email);

            newarr.add(s);

        }

        for(Second i:newarr){
            System.out.println(i.getName());
            System.out.println(i.getEmail());
        }

    }
}
