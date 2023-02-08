public class ReverseStringL {
  // reverse charater  

    // String name = "YashPawtekar";
    // String Revername = " ";
    // public static void main(String[] args){
    // ReverseStringL n= new ReverseStringL();
    // for(int i=n.name.length()-1; i>=0 ; i--){
    // n.Revername = n.Revername + n.name.charAt(i);
    // }
    // System.out.println(n.Revername);
    // }

// reverse word 
    // public static void main(String[] args){
    //     String name = "Yash Pawtekar";
    //     String reversname = "";
    //     String revnamearray[] = name.split("");
    //     for(int i=revnamearray.length-1; i>=0; i--){
    //         reversname = reversname + revnamearray[i] + "";
    //     }
    //     System.out.println(reversname); // hsaY raketwaP
    // }

    
// reverse charater + word 
    public static void main(String[] args){
        String name = "Yash Pawtekar";
        String reversname = "";
        // String revnamearray[] = name.split("");
        for(int i=name.length()-1; i>=0; i--){
            reversname = reversname + name.charAt(i) ;
        }
        System.out.println(reversname); // raketwaP hsaY
    }
}
