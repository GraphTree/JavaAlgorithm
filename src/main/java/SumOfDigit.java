// how to find the sum of digits of a positiv interger number using recursion
public class SumOfDigit {

    public static void main(String[] args) {
        int val = sumDigit(11);
        System.out.println(val);
    }

    public static int sumDigit(int n){
        if (n<10){
            return n;
        }
        return n%10 + sumDigit(n/10);

    }
}
