package problems;

import java.util.LinkedList;
import java.util.List;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        boolean bol = true;
        int k = 1;
        int[] digits2 = new int[digits.length+1];
        boolean all9 = true;

        while(bol){

            for (int i = 0 ; i < digits.length ; i++){
                if (digits[i] != 9){
                    all9 = false;
                    i = digits.length;
                }
            }

            if (all9){
                digits2[0] = 1;
                for (int i = 1 ; i < digits2.length ; i++){
                    digits2[i] = 0;
                }
                return digits2;
            }
            else if (digits[digits.length-k] != 9){
                digits[digits.length-k]++;
                return digits;
            }
            else if (digits[digits.length-k] == 9){
                digits[digits.length-k] = 0;
            }

            k++;
        }

        return digits;

    }
}
