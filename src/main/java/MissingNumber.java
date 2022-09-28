public class MissingNumber {

    public static int missing(int[] arr){
        int sum=0;
        int sum2=0;

        for(int i : arr){
            sum+=i;
        }

        sum2 = 100*(101)/2;

        return sum2-sum;

    }
}
