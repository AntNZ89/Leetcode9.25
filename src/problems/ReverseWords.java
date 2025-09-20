package problems;

public class ReverseWords {
    public String reverseWords(String s) {

        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) != ' '){
                temp.append(s.charAt(i));
            }
            else if (s.charAt(i) == ' '){
                for (int k = temp.length()-1 ; k >= 0  ; k--){
                    ans.append(temp.charAt(k));
                }
                ans.append(' ');
                temp.setLength(0);
            }

            if (i == s.length()-1){
                for (int k = temp.length()-1 ; k >= 0  ; k--){
                    ans.append(temp.charAt(k));
                }
            }
        }

        return ans.toString();

    }
}
