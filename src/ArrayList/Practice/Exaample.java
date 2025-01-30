package ArrayList.Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Exaample {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();

        a.add(1);
        a.add(2);
        a.add(3);

        ArrayList b=new ArrayList();
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(1);
        b.add(2);


       b.addAll(a);
       Collections.sort(b);

//       for(Object i:b){
//           System.out.println(i);
//       }

//       for(int i=1;i<b.size();i++){
//           if (b.get(i-1)==b.get(i)){
//               b.remove(i);
//           }
//       }

       ArrayList sorted=new ArrayList();

//       for(int i=b.size()-1;i>=0;i--){
//           sorted.add(b.get(i));
//       }

        System.out.println("max="+b.getFirst()+"Min="+b.getLast());
//        System.out.println(sorted);

        //Second Examplel------------------------------------

        ArrayList<String> a1=new ArrayList();

        a1.add("Aman");
        a1.add("Manav");
        a1.add("Vash");
        a1.add("Guru");
        a1.add("cop");
        a1.add("pop");

//      for (Object c:a){
//          System.out.println(c);
//      }

        ArrayList q=new ArrayList();

        for(int i=0;i<a.size();i++){
//          System.out.println(i);
            String currentString =a1.get(i);
            if (currentString.length()>3){
                q.add(currentString);
            }
        }

        System.out.println(q);
    }
}
