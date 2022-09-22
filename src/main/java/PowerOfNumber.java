//how to calculate power of a number using recursion

public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(powerOfNumber(5, 2));
    }

    public static int powerOfNumber(int base, int power){
        if (power < 0){
            return -1;
        }
        if (power == 0){
            return 1;
        }
        return powerOfNumber(base, power-1) * base;

    }
}
