import java.util.*;

public class arrayList {
    public static void main(String[] args){
      ArrayList al = new ArrayList();
      al.add(4);
      al.add(5);
      al.add(6);
      al.add(7);
    //   System.out.println(al);

      ArrayList a1 = new ArrayList();
      a1.add(1);
      a1.add(2);
      a1.add(3);
      a1.addAll(al);
      System.out.println(a1);

    System.out.println(a1.contains(7));
    System.out.println(a1.indexOf(5));
    System.out.println(a1.size());
    a1.ensureCapacity(10);
    a1.trimToSize();
    a1.clear();
    System.out.println(a1);


    }
    
}