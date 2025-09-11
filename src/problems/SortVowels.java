package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortVowels {
    public String sortVowels(String s) {

        String vow = "aAeEiIoOuU";
        List<Character> vows = new ArrayList<>();
        List<Character> chars = new ArrayList<>();
        vows.add('a');
        vows.add('A');
        vows.add('e');
        vows.add('E');
        vows.add('i');
        vows.add('I');
        vows.add('o');
        vows.add('O');
        vows.add('u');
        vows.add('U');

        for (int i = 0 ; i < s.length() ; i++){
            if (vows.contains(s.charAt(i))){
                chars.add(s.charAt(i));
            }
        }

        StringBuilder myStringBuilder = new StringBuilder();
        Collections.sort(chars);
        int num = 0;

        for (int i = 0 ; i < s.length() ; i++){
            if (vows.contains(s.charAt(i))){
                myStringBuilder.append(chars.get(num));
                num++;
            }
            else {
                myStringBuilder.append(s.charAt(i));
            }
        }

        return myStringBuilder.toString();

    }
}
