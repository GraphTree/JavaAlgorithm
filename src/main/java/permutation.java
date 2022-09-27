// Your are given two integer arrays. Write a program to check if they are permutation of each other.
// the solution below works only when the both arrays are composed of positive integers
public class permutation {
    public static void main(String[] args) {
        int[] array1 = {1,2,3, 0, 4};
        int[] array2 = {1,4,1, 0, 4};
        boolean result = permutation(array1, array2);
        System.out.println(result);

    }

    public static boolean permutation(int[] array1, int[] array2){
        if (array1.length!=array2.length){
            return false;
        }
        int sum1=0;
        int sum2=0;
        int mul1=0;
        int mul2=0;

        for (int i=0; i<array1.length; i++){
            sum1 += array1[i];
            sum2 += array2[i];
            mul1 *= array1[i];;
            mul2 *= array2[i];;
        }

        if (sum1 == sum2 && mul1 == mul2){
            return true;
        }

        return false;


    }
}
