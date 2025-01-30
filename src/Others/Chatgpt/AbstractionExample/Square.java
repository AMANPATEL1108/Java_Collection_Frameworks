package Others.Chatgpt.AbstractionExample;

import java.util.Scanner;

public class Square extends Shape{
    @Override
    void calculateArea() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a side length of Square:");
        double d1=sc.nextDouble();

        double total=d1*d1;
        System.out.println("Total Area of Square"+total);
    }
}
