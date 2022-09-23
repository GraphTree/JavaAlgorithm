// find greatedst common divisor of two numbers using recursion

//comfused point : the return value of the base case climb the recurision ladder withut being modfied in the middle
// base case answer is the final answer
public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(100, 10));

    }

    public static int gcd(int a, int b){
        if(a<b || a<0 || b<0) {
            return -1;
        }

        if(b==0){
            return a;
        }

        return gcd(b, a%b) ;
    }
}
