class NewMythread extends Thread{

    synchronized public void run(){
           
            try{
                String Nthread = Thread.currentThread().getName();
            Thread.sleep(3000);
              
                    System.out.println(Nthread + " Start a car");
                    Thread.sleep(3000);
                    System.out.println(Nthread + " car remove on parking");
                     Thread.sleep(3000);
                    System.out.println(Nthread + " car drive");
                     Thread.sleep(3000);
                    System.out.println(Nthread + " car park in parking");
                     Thread.sleep(3000);
        
            }catch(Exception e){
                System.out.println("Some Error");
            }
}
}
public class synchronizationM{
  public static void main(String[] args){
      NewMythread nmt1 = new NewMythread();
      NewMythread nmt2 = new NewMythread();
      NewMythread nmt3 = new NewMythread();
      
      nmt1.setName("SON-1");
      nmt2.setName("SON-2");
      nmt3.setName("SON-3");

      nmt1.start();
      nmt2.start();
      nmt3.start();
  }
}