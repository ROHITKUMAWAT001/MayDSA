import java.util.Scanner;

class powerOfn {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(powerN(x, n));
        }

    }

    private static int powerN(int x,int n) {
        if(n==0)return 1;

        int half = powerN(x,n/2);
        if(n%2==0)return half*half;
        return half*half*x;

    }
}
