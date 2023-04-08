abstract class persons{
    public void display(){
      System.out.println("Hey Display");
    }
    abstract public void show();
}
class person1 extends persons{
    public void show(){
        System.out.println("This is Person1");
    }

}


public class Abstraction {
     public static void main(String[] args){
        persons p=new person1();
        p.display();
        p.show();
     }
}


