package problems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxFreqSum {
    public static boolean isVow(char c){
        return c == 'a' || c == 'e' ||  c == 'i' ||  c == 'o' ||   c == 'u';
    }

    public int maxFreqSum(String s) {

        HashMap<Character, Integer> mapV = new HashMap<>();

        int maxV = 0;
        int maxC = 0;

        for (int i = 0 ; i < s.length() ; i++){
            if (mapV.containsKey(s.charAt(i))){
                mapV.put(s.charAt(i),  mapV.get(s.charAt(i)) + 1);
            }
            else if (!mapV.containsKey(s.charAt(i))){
                mapV.put(s.charAt(i), 1);
            }
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (isVow(ch)){
                if (maxV < mapV.getOrDefault(ch, 0)){
                    maxV = mapV.getOrDefault(ch, 0);
                }
            }
            else {
                if (maxC < mapV.getOrDefault(ch, 0)){
                    maxC = mapV.getOrDefault(ch, 0);
                }
            }
        }

        return maxC + maxV;

    }
}
