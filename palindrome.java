class palindrome {
 public static void main(String[] args){
    String str = "2552";
    String str1 = "";
    for(int i=str.length()-1; i>=0; i--){
        str1 = str1 + str.charAt(i);
    }
    // System.out.println(str1);
 if(str1.equals(str)){
    System.out.println("This is palindrome");
 }else{
    System.out.println("This is not a palindrome");
 }
}
} 