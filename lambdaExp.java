interface Car{
    void drive();
}

public class lambdaExp {
    public static void main(String[] args){
        Car car = () ->{
            System.out.println("This is Lambda expression");
        };
        car.drive();
    }
}
