//remove duplicate numbers from the array
public class RemoveDuplicate {


    public static int[] removeDuplicate(int[] a){
        int n = a.length;
        int[] result = new int[n];

        int j = -1;

        for (int i = 0; i < n - 1; i++) {

            if (a[i] != a[i + 1]) {

                result[j++] = a[i];

            }

        }

        result[j++] = a[n - 1];

        return result ;
    }
}
