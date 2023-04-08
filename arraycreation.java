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
      int[][] num = { {1, 2, 3, 4}, {5, 6, 7} };
        
          for(int i=0; i<=1; i++){
           for(int j=0; j<=2; j++){
            System.out.print(num[i][j]);
           }
           System.out.println("");
          }
        }
} 
