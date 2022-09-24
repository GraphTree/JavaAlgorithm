// what is the run time of the function below
// answer = O(n)
// M(n) = 1 + M(n-1) = 1 + (1+M(n-2)) = n + M(n-n) = n

public class FactorialRuntime {

    static int factorial(int n){
        if(n<0){
            return -1;
        } else if (n==0){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
