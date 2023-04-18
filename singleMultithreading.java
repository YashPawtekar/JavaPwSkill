class MyThread extends Thread{
   public void run(){
    String NameS = Thread.currentThread().getName();
       if(NameS == "Cal"){
       Cal();
       }else{
        More();
       }
   }
   public void Cal(){
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
   public void More(){
        System.out.println("yash is there not ");
        System.out.println("yash is there not 1");
        System.out.println("yash is there not 2");
        System.out.println("yash is there not 3");
   
   }
    
}


public class singleMultithreading {
    public static void main(String[] args) throws Exception
    {
        MyThread mt1= new MyThread();
        MyThread mt2= new MyThread();

        mt1.setName("Cal");
        mt2.setName("more");
    System.out.println("Multi Tasking Start");
        mt1.start();
        mt1.join();
        mt2.start();
        mt2.join();
       
    System.out.println("Multi End");
    }
}
