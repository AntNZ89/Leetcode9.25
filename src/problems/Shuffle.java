package problems;

public class Shuffle {
    public int[] shuffle(int[] nums, int n) {

        int[] xInts = new int[n*2];
        int i = 0;
        int j = n;
        int x = 0;
        int y = 1;
        boolean bol = true;

        while(bol){
            if (x > n*2 - 2){
                return xInts;
            }

            xInts[x] = nums[i];
            xInts[y] = nums[j];

            x += 2;
            y += 2;
            i++;
            j++;

        }
        return xInts;

    }
}
