package problems;

import java.util.HashMap;

public class CountPoints {
    public int countPoints(String rings) {

        HashMap<Character , String> map = new HashMap<>();

        for (int i = 1 ; i < rings.length() ; i += 2){

            if (!map.containsKey(rings.charAt(i))){
                map.put(rings.charAt(i), String.valueOf(rings.charAt(i-1)));
            }
            else {
                map.put(rings.charAt(i), map.get(rings.charAt(i)) + rings.charAt(i - 1));
            }
        }

        String s = "";
        boolean r = true;
        boolean g = true;
        boolean b = true;
        int count = 0;


        for (char ch = '0' ; ch <= '9' ; ch++){

            if (map.containsKey(ch)){
                s = map.get(ch);
            }
            else {
                continue;
            }

            for (int j = 0 ; j < s.length() ; j++){
                if (s.charAt(j) == 'R'){
                    r = false;
                }
                else if (s.charAt(j) == 'G'){
                    g = false;
                }
                else if (s.charAt(j) == 'B'){
                    b = false;
                }
            }

            if (!r && !g && !b){
                count++;
            }

            r = true;
            g = true;
            b = true;

        }

        return count;

    }
}
