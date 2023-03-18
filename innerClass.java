class A {
    public void getName(){
        System.out.println("Outer class");
    }
    class B{
        public void getName(){
            System.out.println("inner B class");
        }
    }
    static class C{
        public void getName(){
            System.out.println("inner C class");
        }
    }
}
public class innerClass{
 public static void main(String[] args){
    A obj= new A();
    A.B obj1= obj.new B();
    A.C obj2= new A.C();
    obj.getName();
    obj1.getName();
    obj2.getName();
 }
}
