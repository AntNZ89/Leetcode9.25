package problems;

public class DoesAliceWin {
    public static boolean isVow(char c){
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i'
                || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }

    public boolean doesAliceWin(String s) {

        boolean bol = true;

        while(bol){

            int count = 0;
            int index = 999;

            StringBuilder builder = new StringBuilder();

            for (int i = 0 ; i < s.length() ; i++){
                if(isVow(s.charAt(i)) && count % 2 == 0){
                    index = i;
                    count++;
                }
                else if(isVow(s.charAt(i))){
                    count++;
                }
            }

            if (count == 0){
                return false;
            }
            else if (count == 1 || index == s.length() - 1 || count % 2 != 0){
                return true;
            }
            else if (count > 0){
                for (int i = index+1; i < s.length() ; i++){
                    builder.append(s.charAt(i));
                }
            }

            s = builder.toString();
            builder.setLength(0);
            count = 0;
            index = 999;
            int firstVowel = 888;

            for (int i = 0 ; i < s.length() ; i++){
                if (isVow(s.charAt(i)) && count == 0){
                    firstVowel = i;
                    count++;
                }
                else if (isVow(s.charAt(i)) && count % 2 != 0){
                    index = i;
                    count++;
                }
                else if (isVow(s.charAt(i))){
                    count++;
                }
            }

            if (count == 0){
                return false;
            }
            else if (count == 1){
                for (int i = 0 ; i < firstVowel ; i++){
                    builder.append(s.charAt(i));
                }
            }
            else if (count > 1){
                for (int i = index+1; i < s.length() ; i++){
                    builder.append(s.charAt(i));
                }
            }

        }


        return true;

    }
}
