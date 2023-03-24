import java.util.*;
interface Cal {
void display();
 default void square(){}
 default void rectangle(){}
 default void percentage(){}
}
class squareCal implements Cal{
    float side1;
    float side2;
    public void square(){
     System.out.println("Please enter the value ");
      Scanner scan = new Scanner(System.in);
      side1 = scan.nextFloat();
    }
    
    public void display(){
       System.out.println( "You Square Size is :- " + side1*side1);
    }
}

class rectangleCal implements Cal{
    float side1;
    float side2;
    public void rectangle(){
        System.out.println("Area of a Rectangle calculator ");
        System.out.println("Please enter the value Length");
        Scanner scan = new Scanner(System.in);
        side1 = scan.nextFloat();
        System.out.println("Please enter the value Breadth");
        side2 = scan.nextFloat();

    }
    public void display(){
        System.out.println( "You Area of a Rectangle is :- " + side1*side2);
    }
} 
class percentageCal implements Cal{
    float side1;
    float side2;
    public void percentage(){
        System.out.println("Percentage calculator ");
        System.out.println("Please enter your mark");
        Scanner scan = new Scanner(System.in);
        side2 = scan.nextFloat();
        System.out.println("Please enter total mark");
        side1 = scan.nextFloat();
    }
    public void display(){
        System.out.println( "You Percentage is :- " + (side2/side1)*100 + "%");
    }
} 

class poly{
   public void polyUse(Cal ref) {
    ref.square();
    ref.rectangle();
    ref.percentage();
    ref.display();
   }
}
class askType{
    int TypeNum;
    Cal Square=new squareCal();
    Cal rectangle=new rectangleCal();
    Cal percentage=new percentageCal();
    poly poly = new poly();
    public void askQuestion(){
        System.out.println("1. Area of a Rectangle calculator ");
        System.out.println("2. Square calculator");
        System.out.println("3. Percentage calculator");
        System.out.println("Please select any one option");
        Scanner scan= new Scanner(System.in);
        TypeNum = scan.nextInt();
        if(TypeNum == 1){
         poly.polyUse(rectangle);
        }else if(TypeNum == 2){
            poly.polyUse(Square);
        }else if(TypeNum == 3){
            poly.polyUse(percentage);
        }
        else{
            System.out.println("Please enter correct number");
            System.out.println(""); 
            System.out.println(""); 
            askQuestion();
        }
    }
}

public class Calculator {
    public static void main(String[] args){
        // Cal Square=new squareCal();
        // Cal rectangle=new rectangleCal();
        // poly poly = new poly();
        askType askq = new askType();
        // poly.polyUse(Square);
        // poly.polyUse(rectangle);
        askq.askQuestion();
       
    }
}
