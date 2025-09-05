package problems;

public class RecoverOrder {
    public int[] recoverOrder(int[] order, int[] friends) {

        int[] array = new int[friends.length];
        int n = 0;

        for (int c = 0 ; c < order.length ; c++){
            for (int f = 0 ; f < friends.length ; f++){

                if (order[c] == friends[f]){
                    array[n] = friends[f];
                    n++;
                }
            }
        }
        return array;

    }
}
