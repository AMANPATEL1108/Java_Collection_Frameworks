package Others.Chatgpt.PolymorephismExample;

public class Vehicle {

    void move(){

        System.out.println("Vehical is MOving");
    }


    public static void main(String[] args) {
        Car c=new Car();
        c.move();

        Bicycle b=new Bicycle();
        b.move();

        Vehicle v=new Vehicle();
        v.move();

    }
}
