import java.util.*;
class RemoveDu {
   static String removeDuplicateValue(char str[], int n) {
      int index = 0;
      for (int i = 0; i < n; i++) {
         int j;
         // System.out.println(i);
         for (j = 0; j < n; j++) {
            // System.out.print(j + " ");
            if (str[i] == str[j]) {
               // System.out.print(j + " ");
               break;
            }
         }
         //  System.out.print(j + " ");
         //  System.out.print(i + " ");
         if (j == i) {
            str[index++] = str[i];
         }
         // System.out.println(index);
      }
      return String.valueOf(Arrays.copyOf(str, index));
   }

   public static void main(String[] args) {
      char str[] = "A good morning all of you, Hey i'm yash and I'm a Java Developer".toCharArray();

      int arrayNum = str.length;
      // RemoveDu removeD = new RemoveDu();

      System.out.println(removeDuplicateValue(str, arrayNum));
   }
}