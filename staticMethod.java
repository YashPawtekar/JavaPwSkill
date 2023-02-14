class Student{
    static int a = 18;
    static
    {
    //    System.out.println("Hey im Yash from the static block" );
     a = 20;
    }
    static void dis(){
        System.out.println("Hey im Yash from static method");
        System.out.println("Age is : - " + a);
    }
   
}
public class staticMethod{
    public static void main(String[] args){
        Student s=new Student();
        s.dis();
    }
}