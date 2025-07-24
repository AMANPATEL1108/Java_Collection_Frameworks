package map.weakHashMap;

import java.awt.*;
import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        WeakHashMap<String,Image> weakHashMap=new WeakHashMap();
        weakHashMap.put(new String("img1"),new Image("Image1"));
        weakHashMap.put(new String("img2"),new Image("Image2"));
        System.out.println(weakHashMap);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Afetr Running"+weakHashMap);

    }

    private static void simulateApplicationRunning() {

        try {
            System.out.println("Simulate running");
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();;
        }
    }
}

class Image{
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String  toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}
