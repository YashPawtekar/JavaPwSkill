// Multi tasking with extends

class task1 extends Thread{
    public void run(){
     System.out.println("yash is there");
     System.out.println("yash is there 1");
     System.out.println("yash is there 2");
     System.out.println("yash is there 3");
     System.out.println("yash is there 4");
     System.out.println("yash is there 5");
     
     try{
        for(int i=0; i<3; i++){
            System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
            Thread.sleep(2000);
        }
     }catch(Exception e){
        System.out.println("Some proble or error there");
     }
    }
}
class task2 extends Thread{
    public void run(){
     System.out.println("yash is there not ");
     System.out.println("yash is there not 1");
     System.out.println("yash is there not 2");
     System.out.println("yash is there not 3");

    }
}

public class multitasking{
  public static void main(String[] args){
   System.out.println("Run application : - ");
     task1 t1= new task1();
     task2 t2= new task2();
     t1.start();
     t2.start();
  }
}