//rotate matrix
import java.util.Arrays;

public class RotateMatrix {

    public static void main(String[] args) {
        int[][] testArray = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] result = rotateMatrix(testArray);
//        System.out.println(Arrays.toString(result));
    }

    public static int[][] rotateMatrix(int[][] intArray){
        int[][] answerArray = new int[intArray.length][intArray.length];

        for(int i =0; i < intArray.length; i++){
            int[] tempArray = new int[intArray[i].length];
            for(int j = intArray[i].length -1 ; j >=0; j--){
                tempArray[intArray[i].length-1-j] = intArray[j][i];
            }
            System.out.println(Arrays.toString(tempArray));
            answerArray[i] = tempArray;
        }
        return answerArray;
    }

}
