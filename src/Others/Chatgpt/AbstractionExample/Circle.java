package Others.Chatgpt.AbstractionExample;

import com.sun.nio.sctp.SctpChannel;

import java.util.Scanner;

public class Circle extends Shape{
    @Override
    void calculateArea() {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a radius of Circle:");
        double d=sc.nextDouble();

         double total=3.14*(d*d);

        System.out.println("TOtal Area of circl:"+total);

    }

    public static void main(String[] args) {

        System.out.println("Calculalte Area of  Circle and Square");


        Circle c=new Circle();
        c.calculateArea();

        Square s=new Square();
        s.calculateArea();
    }
}
