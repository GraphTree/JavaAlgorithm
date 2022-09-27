import com.sun.tools.javac.Main;

import java.lang.reflect.Array;
import java.util.Arrays;

// Write a program to find all pairs of integers whose sum is equal to a given number.
//주으사항: java 는 subblock 내에 return 값이 있다고 해당 함수에 return 값이 있다고 여기지 않음. 메인 block 에 또한 return 이 있어야함 (보통 예외를 처리하는데 사)
import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
    int target = 10;
    int[] intArray = {1,2,3,4,5,6};
    int[] result = twoSum(intArray, target);
    System.out.println(Arrays.toString(result));




    }

    public static int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("no solution found");
    }
}
