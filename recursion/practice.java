package recursion;

public class practice {
    public static void main(String[] args) {
        f(3);
    }

    private static void f(int i) {
        if(i>0){
            System.out.println(i);
            f(i-1);
            System.out.println(i);
            f(i-1);
            System.out.println(i);
        }
    }
}
