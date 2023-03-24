
import java.util.*;


class sortAlphabe{
    public static String sortString(String str){
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void main(String[] args){
        String name = "yash pawtekar";
        String outputString = sortString(name);
        System.out.println("Output String : [" + outputString + " ]");
    }
}