public class reversforassignmentQ2 {
    public static void main(String[] args){
        String str = "Think Twice";
        String str1 = " ";
        str.toLowerCase(); // Menotioned assignment in output convert to lower case;
        String strArr[] = str.split(" ");

        for(String ele: strArr){
            for(int i=ele.length()-1; i >= 0; i--){
                str1 = str1 + ele.charAt(i);
            }
            str1 = str1 + " ";
        }
       
        System.out.println(str1);
    }
}
