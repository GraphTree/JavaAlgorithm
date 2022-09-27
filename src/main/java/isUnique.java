public class isUnique {
    public static void main(String[] args) {
        int[] test = {1,2,3};
        boolean answer = isUnique(test);
        if(answer){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static boolean isUnique(int[] intArray){
        for(int i =0; i<intArray.length; i++){
            for(int j =1 + i; j<intArray.length; j++){
                if(intArray[i]==intArray[j]){
                    return false;
                }
            }

        }
        return true;
    }
}
