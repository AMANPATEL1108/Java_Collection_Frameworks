package Others.Chatgpt.ConstructorPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintDataProduct {
    static ArrayList<Book> arrayList=new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("How Many Books Details Want To Enter:");
        int wnattoenterentry=sc.nextInt();


        for(int i=0;i<wnattoenterentry;i++){

            System.out.println("Enter a Book Title");
            String bookname=sc.next();

            System.out.println("Enter a Book Author:");
            String bookauthor=sc.next();

            System.out.println("Enter a Book Price:");
            int bookprice=sc.nextInt();


            Book b=new Book(bookname,bookauthor,bookprice);

            arrayList.add(b);


        }
            int count=1;
        for(Book q:arrayList){
            System.out.println(count+" Person Data Showing");
            System.out.println(q.getTitle());
            System.out.println(q.getAuthor());
            System.out.println(q.getPrice());
            count++;
        }


    }
}
