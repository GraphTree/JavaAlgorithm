public class SumOfDiagonal {
    public static void main(String[] args) {

    }

    public static int sumDiagonal(int[][] a){
        int answer =0;
        for(int i =0; i<a.length; i++){
            answer += a[i][i];

        }
        return answer;
    }
}
