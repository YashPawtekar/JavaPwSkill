import java.util.*;

class uniqueChar {
    public static void main(String[] args) {
        String name = "Yash Pawtekar";

        for (int i = 0; i < name.length(); i++) {
            // System.out.println(name.charAt(i));
            int flag = 0;
            for (int j = 0; j < name.length(); j++) {
                // System.out.print(name.charAt(j));
                if (name.charAt(i) == name.charAt(j) && i != j) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.print(name.charAt(i));
        }
    }
}
