public class inbuildimmutable {
    public static void main(String[] args){
        StringBuffer name= new StringBuffer();
        System.out.println(name.capacity()); // capacity length 16 min
        System.out.println(name.length()); // length is number of character in the String
        System.out.println(name);
    }
}
