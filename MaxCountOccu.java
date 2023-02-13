class MaxCountOccu {
    static final int ASCII_SIZE = 256;
    static char getMaxCountChar(String str){
        int count[] = new int[ASCII_SIZE];
        int len = str.length();
        for(int i=0; i < len; i++){
            // System.out.println(str.charAt(i) + " " + count[str.charAt(i)]++);
            count[str.charAt(i)]++;
        }

        int max = -1; // Initialize max count
        char result = ' '; // Initialize result

        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args){
        String str = "Yash Pawtekar";
        System.out.println("Max occurring character is : - " + getMaxCountChar(str));
    }
    
}
