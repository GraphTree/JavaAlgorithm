import java.util.HashMap;

//Write a function to find all pairs of an integer array whose sum is equal to a given number
public class Pair {
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5};
        int sum =3;
        String answer = pair(testArray, sum);
        System.out.println(answer);
    }

    public static String pair(int[] myArray, int sum){
        HashMap<Integer, Integer> pairData = new HashMap<Integer, Integer>();
        for(int i =0 ; i<myArray.length ; i++){
            for(int j = i+1; j<myArray.length;  j++){
                if(sum == myArray[i]+myArray[j]){
                    pairData.put(Integer.valueOf(i), Integer.valueOf(j));
                }
            }
        }
        String result = "";
        for (Integer key : pairData.keySet()){
            result = result + key + ":" + pairData.get(key) +" ";


        }
        return result;
    }
}
