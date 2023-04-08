interface A25{
    void dis();
}

public class annonymaousClass {
   public static void main(String[] args){
    A25 obj = new A25(){
        public void dis() {
         System.out.println("This is Annonymaous Class");
        }
     };
     obj.dis();
   }

    
}
