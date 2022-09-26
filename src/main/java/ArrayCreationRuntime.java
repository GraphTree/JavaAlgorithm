

// calculate runtime of creating an array
public class ArrayCreationRuntime {

    public static int[] arrayCreation(){

        //type 1  = O(n)
        int[] intArray;
        intArray = new int[3];
        intArray[0] =1;
        intArray[1] =2;
        intArray[3] =3;

        //type 2 = O(1)
        int[] intArray2 = {1,2,3};


    }
}
