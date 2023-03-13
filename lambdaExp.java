interface A2 {
    public void disp();
}

public class lambdaExp {
    public static void main(String[] args){
        A2 a= () ->{
          System.out.println("Display . . .");
        };
        a.disp(); 
    }
}
