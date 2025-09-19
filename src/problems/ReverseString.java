package problems;

public class ReverseString {
    public void reverseString(char[] s) {

        char[] ans = new char[s.length];

        for (int i = 0 ; i < ans.length  ; i++){
            ans[ans.length-1-i] = s[i];
        }

        for (int i = 0 ; i < ans.length ; i++){
            s[i] = ans[i];
        }

    }
}
