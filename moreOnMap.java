import java.util.*;
import java.util.Map.*;

import javax.swing.text.html.parser.Entity;

class StudentAKW{
    private String name; 
    private String div; 
    private String clases;


    
    public StudentAKW(String name, String div, String clases) {
        this.name = name;
        this.div = div;
        this.clases = clases;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDiv() {
        return div;
    }
    public void setDiv(String div) {
        this.div = div;
    }
    public String getClases() {
        return clases;
    }
    public void setClases(String clases) {
        this.clases = clases;
    }
    public String toString(){
         return name + " " + div + " " + clases ;
    }
     
}


public class moreOnMap {
    
    public static void main(String[] args){
        StudentAKW st1 =new StudentAKW(" Yash", "15th", "E");
        StudentAKW st2 =new StudentAKW(" Jay", "13th", "D");
        StudentAKW st3 =new StudentAKW(" Peter", "10th", "C");
       
        Map map = new HashMap();
        map.put(01, st1);
        map.put(02, st2);
        map.put(03, st3);
        
        // System.out.println(map);
        Set set= map.entrySet();
        Iterator iter1 = set.iterator();
         while (iter1.hasNext()) {
            // System.out.println(iter1.next());
            Map.Entry mapE =(Entry) iter1.next();
            System.out.println(mapE.getKey() + " : " + mapE.getValue() );
         }

    } 
}
