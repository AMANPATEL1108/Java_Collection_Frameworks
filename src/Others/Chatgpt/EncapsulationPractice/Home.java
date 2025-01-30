package Others.Chatgpt.EncapsulationPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Home {

    static ArrayList<Data> arrayList=new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a How Many Oreder Product Details Want to EENter:");
        int noofproduct=sc.nextInt();

        for(int i=0;i<noofproduct;i++){

            System.out.println("Enter a Product NAme:");
            String productname=sc.next();
            System.out.println("Enter a Product Price:");
            int productprice=sc.nextInt();
            System.out.println("Enter a Product Quantity:");
            int productquantity=sc.nextInt();

            Data d=new Data(productname,productprice,productquantity);

            arrayList.add(d);

        }


        for(Data i:arrayList){
            System.out.println(i.getProductname());
            System.out.println(i.getPrice());
            System.out.println(i.getQualtity());
        }

        System.out.println("Here is Printed Data ENtered");

        updatedata(sc);
    }

    static void updatedata(Scanner sc){
        System.out.println("Do You Want Update That:\n 1.Yes  \n 2.No");
        int wahtudtornot=sc.nextInt();

        if (wahtudtornot==1){
            whichUpdate(sc);
        }else if (wahtudtornot==2){
            System.out.println("Not Updated");
        }else {
            System.out.println("Enter a Corrct Number !!:");
            updatedata(sc);
        }
    }

    static void whichUpdate(Scanner sc) {
        System.out.println("Which Product Do You Want to Update:");
        String updatingproduct = sc.next();

        boolean found = false;
        for (Data i : arrayList) {
            System.out.println("Here is a Which Update Function Called");
            System.out.println(i.getProductname().toLowerCase());

            if (updatingproduct.equalsIgnoreCase(i.getProductname())) {
                System.out.println("Enter a New Price:");
                int newprice = sc.nextInt();
                System.out.println("Enter a New Quantity:");
                int newquantity = sc.nextInt();

                i.setPrice(newprice);
                i.setQualtity(newquantity);
                found = true;
                break;
            }
        }

        if (found==false) {
            System.out.println("Enter a Correct Product Name:");
            whichUpdate(sc);
        }

        System.out.println("Do You Want to Print New Updated Data:\n 1.Yes  \n 2.No");
        int showupdatedData = sc.nextInt();

        if (showupdatedData == 1) {
            for (Data i : arrayList) {
                System.out.println(i.getProductname());
                System.out.println(i.getPrice());
                System.out.println(i.getQualtity());
            }
        } else {
            System.out.println("Good Bye");
        }
    }



}
