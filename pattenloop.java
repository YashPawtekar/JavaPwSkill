class pattenloop {
    // public static void main(String[] args){
    //     int n = 5;
    //     for(int i= 0; i< n; i++){
    //         for(int j= 0; j< n; j++){
    //            if(i==0 || j==0 || i==n-1 || j==n-1){
    //             System.out.print("*");
    //            }else{
    //             System.out.print(" ");
    //            }
    //         }
    //         System.out.println("");
    //     }
    // }

    // patter 1

    // public static void main(String[] args){
    //     int n = 10;
    //     for(int i= 0; i< n; i++){
    //         for(int j= 0; j< n; j++){
    //            if(i==0 || j==0 || i==(n-1)/2 || j==n-1){
    //             System.out.print("*");
    //            }else{
    //             System.out.print(" ");
    //            }
    //         }
    //         System.out.println("");
    //     }
    // }

    // patter H 

    // public static void main(String[] args){
    //     int n = 10;
    //     for(int i= 0; i< n; i++){
    //         for(int j= 0; j< n; j++){
    //            if(j==0 || j==n-1 || i==(n-1)/2){
    //             System.out.print("*");
    //            }else{
    //             System.out.print(" ");
    //            }
    //         }
    //         System.out.println("");
    //     }
    // }

     // patter I

    // public static void main(String[] args){
    //     int n = 10;
    //     for(int i= 0; i< n; i++){
    //         for(int j= 0; j< n; j++){
    //            if(i==0 || i==n-1 || j==(n-1)/2){
    //             System.out.print("*");
    //            }else{
    //             System.out.print(" ");
    //            }
    //         }
    //         System.out.println("");
    //     }
    // }

    // patter E

    // public static void main(String[] args){
    //     int n = 10;
    //     for(int i= 0; i< n; i++){
    //         for(int j= 0; j< n; j++){
    //            if(i==0 || j==0 || i==n-1 || i==(n-1)/2){
    //             System.out.print("*");
    //            }else{
    //             System.out.print(" ");
    //            }
    //         }
    //         System.out.println("");
    //     }
    // }
    // patter F

    // public static void main(String[] args){
    //     int n = 10;
    //     for(int i= 0; i< n; i++){
    //         for(int j= 0; j< n; j++){
    //            if(i==0 || j==0 || i==(n-1)/2){
    //             System.out.print("*");
    //            }else{
    //             System.out.print(" ");
    //            }
    //         }
    //         System.out.println("");
    //     }
    // }

    // patter D

    // public static void main(String[] args){
    //     int n = 10;
    //     for(int i= 0; i< n; i++){
    //         for(int j= 0; j< n; j++){
    //            if(i==0 && j<(n-1)/2 || j==0 || i==n-1 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<n-1){
    //             System.out.print("*");
    //            }else{
    //             System.out.print(" ");
    //            }
    //         }
    //         System.out.println(" ");
    //     }
    // }


    //    patter A

    public static void main(String[] args){
        int n = 10;
        for(int i= 0; i< n; i++){
            for(int j= 0; j< n; j++){
               if(j==0 && i>0 || i==0 && j>0 && j<n-1 || j==n-1 && i>0 || i==(n-1)/2){
                System.out.print("*");
               }else{
                System.out.print(" ");
               }
            }
            System.out.println(" ");
        }
    }

    //    patter BB

    // public static void main(String[] args){
    //     int n = 10;
    //     for(int i= 0; i< n; i++){
    //         for(int j= 0; j< n; j++){
    //             // 
    //            if(j==0 && i>0 && i<n-1 || i==0 && j>0 && j<n-1 || j==n-1 && i>0 && i<n-1 || i==(n-1)/2 || i==n-1 && j<n-1 && j>0 ){
    //             System.out.print("*");
    //            }else{
    //             System.out.print(" ");
    //            }
    //         }
    //         System.out.print("  ");
    //         for(int j= 0; j< n; j++){
    //             // 
    //            if(j==0 && i>0 && i<n-1 || i==0 && j>0 && j<n-1 || j==n-1 && i>0 && i<n-1 || i==(n-1)/2 || i==n-1 && j<n-1 && j>0 ){
    //             System.out.print("*");
    //            }else{
    //             System.out.print(" ");
    //            }
    //         }
    //         System.out.println(" ");
    //     }

      //    patter N

    // public static void main(String[] args){
    //     int n = 10;
    //     for(int i= 0; i< n; i++){
    //         for(int j= 0; j< n; j++){
    //            if(j==0 || j==n-1 || i==j){
    //             System.out.print("*");
    //            }else{
    //             System.out.print(" ");
    //            }
    //         }
    //         System.out.println(" ");
    //     }
    // }

        // patter X

    // public static void main(String[] args){
    //     int n = 10;
    //     for(int i= 0; i< n; i++){
    //         for(int j= 0; j< n; j++){
    //            if(i==j || i+j == n-1){
    //             System.out.print("*");
    //            }else{
    //             System.out.print(" ");
    //            }
    //         }
    //         System.out.println(" ");
    //     }
    // }


        // patter New pattern 1

        // public static void main(String[] args){
        //     int n = 20;
        //     for(int i= 0; i< n; i++){
        //         for(int j= 0; j< n; j++){
        //            if(i==j || i+j == n-1 || i==0 || j==n-1 || j==0 || i==n-1 || i+j==(n-1)/2 || i-j ==(n-1)/2 || j-i==(n-1)/2 || j+i==(n-1) + (n-1)/2){
        //             System.out.print("*");
        //            }else{
        //             System.out.print(" ");
        //            }
        //         }
        //         System.out.println(" ");
        //     }
        // }

          // patter New pattern 2

        //   public static void main(String[] args){
        //     int n = 20;
        //     for(int i= 0; i< n; i++){
        //         for(int j= 0; j< n; j++){
        //            if(i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j <= (n-1)/2 || j-i > (n-1)/2 || j == 0 || j==(n-1) || i==(n-1)){
        //             System.out.print("*");
        //            }else{
        //             System.out.print(" ");
        //            }
        //         }
        //         System.out.println(" ");
        //     }
        // }
        
    }

