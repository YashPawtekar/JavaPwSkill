import java.util.*;
import java.util.Map.*;

public class mapcollecation {
    public static void main(String[] args){
        Map map= new HashMap();
        map.put(1, "yash"); // Entry
        map.put(2, "jay");
        map.put(3, "vijay");
        map.put(4, "rajesh");

        // System.out.println(map.get(1));

        Set keySet=map.keySet();
        Iterator iter1= keySet.iterator();
        while(iter1.hasNext()){
            // System.out.println(iter1.next());
            int key =(int) iter1.next();
            System.out.println(key);
        }
        Collection mapValue= map.values();
        Iterator value = mapValue.iterator();
        while(value.hasNext()){
            // System.out.println(value.next());
            String valuess =(String) value.next();
            System.out.println(valuess);
        }
        Set EntrySet = map.entrySet();
        Iterator iter2= EntrySet.iterator();
        while(iter2.hasNext()){
            // System.out.println(iter2.next());
            Map.Entry enteryV=(Entry) iter2.next();
            System.out.println(enteryV.getKey() + " : " + enteryV.getValue());
        }
    }
}
