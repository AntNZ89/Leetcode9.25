package problems;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        int res = 0;

        String[] ans = s.split(" ");

        res = ans[ans.length-1].length();

        return res;

    }
}
