//find out the missing number of an array

public class FindMissingNumber {

    public static void main(String[] args) {

    }

    public static void missingNumber(int[] intArray) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i : intArray) {
            sum1 += i;
        }

        sum2 = 100*(100+1)/2;
        int difference = sum2-sum1;

        System.out.println("missing number is "+difference);

    }
}
