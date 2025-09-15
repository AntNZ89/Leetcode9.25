package problems;

import java.util.HashSet;

public class CanBeTypedWords {
    public int canBeTypedWords(String text, String brokenLetters) {

        boolean bol = true;
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        int cnt = 0;
        int words = 1;

        for (int i = 0 ; i < brokenLetters.length() ; i++){
            set.add(brokenLetters.charAt(i));
        }

        for (int i = 0 ; i < text.length() ; i++){
            if (set.contains(text.charAt(i)) && bol){
                bol = false;
                cnt++;
                if (cnt == 1){
                    count++;
                }
            }
            else if (text.charAt(i) == ' '){
                bol = true;
                cnt = 0;
                words++;
            }
        }
        return words - count;

    }
}
