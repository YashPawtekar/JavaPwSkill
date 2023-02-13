public class ReversForassignment {
    public static void main(String[] args){
     String str = "PWSKILLS";
     int len = str.length();
     String reversname = " ";
    //  System.out.println(len);
     for(int i=len-1; i >=0; i--){
        reversname = reversname + str.charAt(i);
     }
     System.out.println(reversname);
    }
}
// Think Twice
