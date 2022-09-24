// calculate runtime of fibonacci function
// answer = M(2^n)
// M(n) = M(n-1) + M(n-2) = (M(n-2) + M(n-3)) + (M(n-3) + M(n-4))
// -> 2^(n+1) -2 개 만큼의 M(?) 함수가 실행되어야함
public class FibonacciRuntime {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int n){
        if (n==0 || n==1){
            return n;
        };

        return fib(n-1) + fib(n-2);
    }
}
