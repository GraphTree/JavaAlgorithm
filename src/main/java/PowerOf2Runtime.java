// calculate runtime of function below
// answer = log(n)
// value of n decreases by half for each recursion step
public class PowerOf2Runtime {

    static int powerOf2(int n){
        if(n<1){
            return 0;
        } else if(n==1){
            System.out.println(1);;
            return 1;
        } else {
            int prev = powerOf2(n/2);
            int curr = prev*2;
            System.out.println(curr);
            return curr;
        }
    }
}
