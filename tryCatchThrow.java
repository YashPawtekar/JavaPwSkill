class a96{
  public void FirstM()
  {
    int num1=6;
        int num2=0;
        int result=0;
        try{
            result= num1/num2;
        }catch(Exception e){
            System.out.println("Please Enter vaild number");
        }finally{
            System.out.println("Finally run");
        }
       
        System.out.println(result);
  } 
}




public class tryCatchThrow {
    public static void main(String[] args){
        a96 a= new a96();
        a.FirstM();
    }
}
