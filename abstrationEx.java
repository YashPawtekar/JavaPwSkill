
// abstract class office{

//     abstract public void work();
//     abstract public void name();
//     public void address(){
//         System.out.println("Pune");
//     }
// }

// class employee1 extends office{
//     public void work(){
//         System.out.println("Work of HR");
//       }
//       public void name(){
//           System.out.println("Employee1 is the name of employee");
//       }
// }



// public class abstrationEx {
//     public static void main(String[] args){
//         employee1 e1=new employee1();
//         e1.work();
//         e1.name();
//         e1.address();
       
//     }
// }

abstract class office{

    abstract public void work();
    abstract public void name();
    public void address(){
        System.out.println("Pune");
    }
}

class employee1 extends office{
    public void work(){
        System.out.println("Work of HR");
    }
    public void name(){
        System.out.println("Employee1 is the name of employee");
    }
}

public class abstrationEx {
    public static void main(String[] args){
        employee1 e1=new employee1();
        e1.work();
        e1.name();
        e1.address(); 
    }
}