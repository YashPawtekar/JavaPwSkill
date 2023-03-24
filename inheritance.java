class StudentS {
    private int id;
    // int id;
    
    StudentS(){
        System.out.println("This Parent Class Constructor . . .");
    }
    public void show() {
        System.out.println(id);
    }
}

class Teacher extends StudentS {

}

public class inheritance {
    public static void main(String[] agrs) {
        Teacher t = new Teacher();
        t.show();
    }
}