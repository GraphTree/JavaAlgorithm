import java.util.Arrays;

public class MiddleTaker {
    public static void main(String[] args) {

    }

    public static int[] middleTaker(int[] arr){
        return Arrays.copyOfRange(arr, 1, arr.length-1);
    }
}
