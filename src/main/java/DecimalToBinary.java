// convert a number from decimal to binary using revursion


public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(Function(4));

    }

    public static int Function(int n){
        if(n<0){
            return -1;
        }

        if (n<2){
            return n;
        } else {
            return (Function(n/2) * 10) + n%2;
        }

    }
}
