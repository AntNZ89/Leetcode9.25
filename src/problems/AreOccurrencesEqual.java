package problems;

import java.util.HashMap;

public class AreOccurrencesEqual {
    public boolean areOccurrencesEqual(String s) {

        HashMap<Character , Integer> map = new HashMap<>();
        int count = -1;

        for (int i = 0 ; i < s.length() ; i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i) , map.get(s.charAt(i)) + 1);
            }
            else {
                map.put(s.charAt(i) , 1);
            }
        }

        for (char ch = 'a' ; ch <= 'z' ; ch++){

            if (map.containsKey(ch) && count == -1){
                count = map.get(ch);
            }
            else if (map.containsKey(ch)){
                if (count != map.get(ch)){
                    return false;
                }
            }

        }

        return true;

    }
}
