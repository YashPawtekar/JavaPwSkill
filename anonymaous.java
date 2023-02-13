
class Cal{
    // STEP 1 
    // public int add(int a , int b){
    //     int result = a + b;
    //     return result;
    // }

     // STEP 2
     public int add(int num[]){
        int result = 0;
        for (int n : num) {
             result = result + n;
        }
        return result;
    }
}


public class anonymaous {
    // STEP 1 
    // public static void main(String[] args){
    //     Cal cal = new Cal();
    //     int result = cal.add(5, 6);
    //     System.out.println(result);
    // }


 // STEP 2 
     public static void main(String[] args){
        Cal cal = new Cal();
        int arr[] = {1,2,5,6,8,7, 50,53,62};
        int result = cal.add(arr);
        System.out.println(result);
    }
}
