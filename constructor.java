class StudentNew {
    private int age;
    private String name;

    StudentNew(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void show(){
        // System.out.println(age + " " + name);
         System.out.println(age + " " + name);
        
    }
}

public class constructor {

    public static void main(String[] args) {
        StudentNew s1 = new StudentNew(20, "Yash Pawtekar");
        s1.show();
    }
}