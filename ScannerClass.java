import java.util.Scanner;
class ScannerClass {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter your name : ");
            String name = scan.next(); 
            System.out.println("Name is : " + name);

            System.out.println("Enter your age : ");
            int age=scan.nextInt(); 
            System.out.println("Name is : " + age);

            System.out.println("Enter your Number : ");
            int Number=scan.nextInt(); 
            System.out.println("Name is : " + Number);
        }
    }
}
