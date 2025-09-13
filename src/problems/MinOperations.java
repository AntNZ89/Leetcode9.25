package problems;

public class MinOperations {
    public int[] minOperations(String boxes) {

        int[] answer = new int[boxes.length()];
        int len = 0;

        for (int i = 0 ; i < boxes.length() ; i++){
            for (int j = 0 ; j < boxes.length() ; j++){
                if (i == j){
                    continue;
                }
                else if (boxes.charAt(j) == '1'){
                    len += Math.abs(i - j);
                }
            }
            answer[i] = len;
            len = 0;
        }

        return answer;

    }
}
