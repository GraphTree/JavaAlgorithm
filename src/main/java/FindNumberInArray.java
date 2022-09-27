public class FindNumberInArray {

    public static void main(String[] args) {

    }

    public static int SearchInArray(int[] intArray, int valueToSearch){
        for(int i=0; i<intArray.length; i++){
            if(intArray[i]==valueToSearch){
                return i;
            }
        }
        throw new IllegalArgumentException("no solution found");
    }
}
