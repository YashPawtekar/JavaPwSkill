interface A{
    public void show();
    static void display(){
        System.out.println("Interface A in display");
    }
}
class B implements A{
    public void show(){
        System.out.println("Class B show print");
    }

    public void display() {
        System.out.println("Class B in display");
    }
}


public class interfaceClass {
   public static void main(String[] args){
     B b=new B();
     b.show();
     b.display();
     A.display();
   } 
}
