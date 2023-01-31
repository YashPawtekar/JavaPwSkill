public class condition {
 
    // public static void main(String[] args){
    //     int age = 18;
    // if(age > 18){
    //     System.out.println("your bigger");
    // }else{
    //     System.out.println("your smaller");
    // }
    // }
    public static void main (String[] args){
        int age =20;
        if(age <= 18){
            System.out.println("im smaller");
        }else if(age>18 || age < 21 ){
            System.out.println("im bigger but not apply for loan ");
        }else if(age> 18 || age>21){
            System.out.println("im eligible for loan applay");
        }
    }
}
