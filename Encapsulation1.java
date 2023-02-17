class StudentN {
  private int age;
  private String name;
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void show() {
    System.out.println(age + " " + name);
  }
  
}

public class Encapsulation1 {
  public static void main(String[] args) {
    StudentN obj = new StudentN();
    StudentN obj1 = new StudentN();
    obj1.setAge(21);
    obj1.setName("Vijay Kumar");
    obj.setAge(18);
    obj.setName("Yash Pawtekar");
    obj.show();
    obj1.show();
    System.out.println(obj1.getName());
  }
}
