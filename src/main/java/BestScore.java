// find the first and second largest number in the array
// collections.reverseorder takes only integer class. thus do not use int[]

import java.util.Arrays;
import java.util.Collections;

public class BestScore {

    public static String firstSecond(Integer[] myArray){
        Integer[] arr = myArray;
        Arrays.sort(arr, Collections.reverseOrder());
        int first = arr[0];
        Integer second = null;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != first) {
                second = arr[i];
                break;
            }
        }
        return first+" "+second;


    }
}
