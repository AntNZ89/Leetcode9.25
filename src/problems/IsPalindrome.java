package problems;

public class IsPalindrome {
    public boolean isPalindrome(String s) {

        StringBuilder builder1 = new StringBuilder();
        s = s.toLowerCase();

        int k = s.length()-1;
        int i = 0;

        while (i < s.length()){

            if (!isA(s.charAt(i))){
                i++;
            }
            else if (!isA(s.charAt(k))){
                k--;
            }
            else if (s.charAt(i) != s.charAt(k)){
                return false;
            }
            else {
                i++;
                k--;
            }

        }

        return true;

    }

    private static boolean isA(char c){
        return c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g' || c == 'h' || c == 'i' ||
                c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'o' || c == 'p' || c == 'q' || c == 'r' ||
                c == 's' || c == 't' || c == 'u' || c == 'v' || c == 'w' || c == 'x' || c == 'y' || c == 'z' || c == '0' ||
                c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' ;
    }

}
