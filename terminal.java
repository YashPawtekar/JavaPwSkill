public class terminal {
    public static void main(String[] args){
        // int age=20;
        // String result;
        // result = (age > 18) ? "im bigger" : "im smaller";
        // System.out.println(result); 
        int age=17;
        String result;
        result = (age > 18) ? (age>18 && age>21 ? "eligible": "not eligible") : "im smaller";
        System.out.println(result); 
    }
}
