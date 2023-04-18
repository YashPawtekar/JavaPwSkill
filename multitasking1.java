// Multi tasking with implements

class task1 implements Runnable{
    public void run(){
     System.out.println("yash is there");
     try{
        for(int i=0; i<3; i++){
            System.out.println("YYY*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
            Thread.sleep(2000);
        }
     }catch(Exception e){
        System.out.println("Some proble or error there");
     }

     System.out.println("yash is there 1");
     System.out.println("yash is there 2");
        
     System.out.println("yash is there 3");
     System.out.println("yash is there 4");
     System.out.println("yash is there 5");
     
   
    
    }
}
class task2 implements Runnable{
    public void run(){
     System.out.println("yash is there not ");
     System.out.println("yash is there not 1");
     System.out.println("yash is there not 2");
     System.out.println("yash is there not 3");

    }
}

public class multitasking1{
  public static void main(String[] args){
   System.out.println("Run application : - ");
     task1 t1= new task1();
     task2 t2= new task2();
    Thread nt1 = new Thread(t1);
    Thread nt2 = new Thread(t2);
    nt1.start();
    nt2.start();
  }
}