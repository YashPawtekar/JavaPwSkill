class Studentn1{
    private int age;
    private String name;

    Studentn1(){

    }
    Studentn1(int age, String name)
    {
     this.age= age;
     this.name= name;
    }
    public void show(){
        System.out.println(age + " " + name);
    }
}




public class constructor1 {
    public static void main(String[] args){
     Studentn1 obj= new Studentn1();
     Studentn1 obj1= new Studentn1(20, "Yash pawtekar");
     obj.show();
     obj1.show();
    }
}
