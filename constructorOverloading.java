class employee{
    private int id;
    private String name;
    private int salary;

    employee(){
        System.out.println("This is not parameter construtor");
    }
    employee(int id){
       this.id = id;
    }
     employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void show(){
        System.out.println("Employee id is : - " + id);
        System.out.println("Employee Name is : - " + name);
        System.out.println("Employee Salary is : - " + salary);
        System.out.println("");
    }
}

public class constructorOverloading {
    public static void main(String[] args){
        employee e1= new employee();
        e1.show();
        employee e2= new employee(118);
        e2.show();
        employee e3= new employee(119 , "Vijay Pawar");
        e3.show();
        employee e4= new employee(120, "Sujay Kumar", 100000000);
        e4.show();
    }
}
