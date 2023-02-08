public class pangram {
    public static void main(String[] args){
        String str1 = "THE QUICK ROWN FOX JUMPS OVER LAZY DOG";
        str1=str1.replace(" ", "");
        boolean flag = false;
        char arr1[] = str1.toCharArray();
        int ch[] = new int[26];

        for(int i=0; i<arr1.length; i++){
          ch[arr1[i]-65]++;
        }
        for(int i=0; i<ch.length; i++){
            if(ch[i] == 0){
                System.out.println("Its not a pangram");
                flag =true;
            }
        }
        if(flag==false){
            System.out.println("Its a pangram");
        }
    }

}
