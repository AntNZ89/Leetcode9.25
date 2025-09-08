package problems;

public class GetNoZeroIntegers {
    public int[] getNoZeroIntegers(int n) {

        int[] ints = new int[2];
        boolean bol = true;
        int i = 1;

        if (n == 2){
            ints[0] = 1;
            ints[1] = 1;
            return ints;
        }
        else if (n == 3){
            ints[0] = 1;
            ints[1] = 2;
            return ints;
        }

        while(bol){

            bol = false;

            if (n % 2 == 0){
                ints[0] = n/2 - i;
                ints[1] = n/2 + i;
            }
            else {
                ints[0] = n/2 - i;
                ints[1] = n/2 + i + 1;
            }

            String s1 = String.valueOf(ints[0]);
            String s2 = String.valueOf(ints[1]);

            if (s1.contains("0")  || s2.contains("0")){
                bol = true;
            }

            i++;
            s1 = "";
            s2 = "";
        }

        return ints;

    }
}
