class Methodoverloading {
    public int add(int a, int b) {
        int result;
        result = a + b;
        return result;
    }
    public int add(int a, int b, int c) {
        int result;
        result = a + b / c;
        return result;
    }
}
class demo{
    public static void main(String[] args){
        Methodoverloading m= new Methodoverloading();
        int result = m.add(5, 5);
        int result1 = m.add(5, 5, 5);
        System.out.println(result);
        System.out.println(result1);
    }
}