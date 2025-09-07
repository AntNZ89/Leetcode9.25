package problems;

public class SumZero {
    public int[] sumZero(int n) {

        int[] ints = new int[n];
        int index = 0;


        if (n % 2 == 0){
            for (int i = -(n/2) ; i <= n/2  ; i++){
                if (i != 0){
                    ints[index] = i;
                    index++;
                }
            }
        }
        else {
            for (int i = -(n/2) ; i <= n/2  ; i++){
                ints[index] = i;
                index++;
            }
        }

        return ints;

    }
}
