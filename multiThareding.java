public class multiThareding {
    public static void main(String[] args){
        System.out.println("Multi tasking running");
        String name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(Thread.currentThread().getPriority());

        System.out.println("**********************************************************************************************");
        Thread t= Thread.currentThread();
        t.setName("YashP");
        t.setPriority(1);

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
