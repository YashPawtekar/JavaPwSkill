class StudentYash{
	int age;
	String name;

   public void show()
   {
   System.out.println(age+" "+name);
   }
}
public class demo1{
   public static void main(String[] args){
	StudentYash obj=new StudentYash();
   obj.age=18;
   obj.name="John";
   obj.show();
   }
}
