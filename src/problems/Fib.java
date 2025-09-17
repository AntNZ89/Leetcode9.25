package problems;

public class Fib {
    public int fib(int n) {
        if (n == 0){
            return 0;
        }
        return recFib(n);
    }

    private static int recFib(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return recFib(n-1) + recFib(n-2);
    }
}
