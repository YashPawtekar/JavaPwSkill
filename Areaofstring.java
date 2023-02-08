class Stringarea2{
    public static void main(String[] args){
        //type 1
        String a1= "pw";
        String b1= "pw";
       System.out.println(a1==b1);

        //type 2
        String a= new String("pw");
        String b= new String("pw");
       System.out.println(a==b);

      //wayofcompare
      String s1= "pw";
      String s2= new String("PW"); // capial letter
      String s3= new String("pw");
      System.out.println(s1==s2);
      System.out.println(s1==s3);
      System.out.println(s1.equals(s3)); // equals() method
      System.out.println(s1.equalsIgnoreCase(s2)); // ignore case s1 is small letter and s2 is capital letter 
      // then ignore case then show True
    }
}
