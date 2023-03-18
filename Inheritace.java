class StudentN12 {
    public void display() {
        System.out.println("Student class");
    }
}

class teacher extends StudentN12 {
    public void display() {
        System.out.println("teacher class");
    }
}

public class Inheritace {
    public static void main(String[] args) {
        StudentN12 s = new StudentN12();
        s.display();
        teacher t = new teacher();
        t.display();
    }
}
