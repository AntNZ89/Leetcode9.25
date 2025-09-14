package problems;

import java.util.HashMap;
import java.util.HashSet;

public class SpellChecker {
    public String[] spellchecker(String[] wordlist, String[] queries) {

        HashSet<String> set = new HashSet<>();
        HashMap<String, String> mapLow = new HashMap<>();
        HashMap<String, String> mapVow = new HashMap<>();
        String[] answer = new String[queries.length];

        for (int i = 0 ; i < wordlist.length ; i++){

            set.add(wordlist[i]);

            mapLow.putIfAbsent(wordlist[i].toLowerCase() , wordlist[i]);

            mapVow.putIfAbsent(deVowel(wordlist[i].toLowerCase()) , wordlist[i]);

        }


        for (int i = 0 ; i < queries.length ; i++){

            if (set.contains(queries[i])){
                answer[i] = queries[i];
            }
            else if (mapLow.containsKey(queries[i].toLowerCase())){

                answer[i] = mapLow.get(queries[i].toLowerCase());

            }
            else if (mapVow.containsKey(deVowel(queries[i].toLowerCase()))){

                answer[i] = mapVow.get(deVowel(queries[i].toLowerCase()));

            }
            else {
                answer[i] = "";
            }
        }

        return answer;


    }

    public String deVowel(String s){

        StringBuilder builder = new StringBuilder();

        for (int i = 0 ; i < s.length() ; i++){
            if (!isVow(s.charAt(i))){
                builder.append(s.charAt(i));
            }
            else if (isVow(s.charAt(i))){
                builder.append('0');
            }
        }

        return builder.toString();

    }

    public boolean isVow(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
