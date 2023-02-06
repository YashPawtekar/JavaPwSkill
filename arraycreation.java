 class arraycreation {
   // Pre Diffine Array
    // public static void main(String[] args){
    // int num[] = {11,3,18,6};
    //   for(int i=0; i<=3; i++){
    //     System.out.println(num[i]);
    //   }
    // }

    // automatic generate array that time use this 
    public static void main(String[] args){
        int num[] = new int[4];
        num[0]= 11;
        num[1]= 18;
        num[2]= 3;
        num[3]= 6;
          for(int i=0; i<=3; i++){
            System.out.println(num[i]);
          }
        }
} 
