
class office{

    public void work(){
      System.out.println("All empolyee work on office");
    }
    public void name(){
        System.out.println("Office Name XYZ.com");
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

class ploymor{
    public void ployNew(office office){
        System.out.println("------------------------------------------------------------------------------");
     office.work();
     office.name();
     System.out.println("------------------------------------------------------------------------------");
    }
}

public class polymorphismEx1 {
    public static void main(String[] args){
        office office=new office();
        employee1 e1=new employee1();
        // office.work();
        // office.name();
        // e1.work();
        // e1.name();
        ploymor ploy=new ploymor();
        ploy.ployNew(office);
        ploy.ployNew(e1);
    }
}
