public class finalvsimmutable {
     public static void main(String[] args){
        final StringBuffer name = new StringBuffer("Virat");
        name.append(" koli");
        System.out.println(name);
        //  name = new StringBuffer("sachine");
         System.out.println(name);
     }
}
