package problems;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strings) {

        StringBuilder ans = new StringBuilder();
        StringBuilder sna = new StringBuilder();
        boolean con = true;

        if (strings.length == 1){
            return strings[0];
        }

        for (int i = 0 ; i < strings.length ; i++){
            if (strings[i].equals("")){
                return "";
            }
        }


        for (int j = 0 ; j < Math.min(strings[0].length(), strings[1].length()) ; j++){

            if (strings[0].charAt(j) == strings[1].charAt(j) && con){
                ans.append(strings[0].charAt(j));
            }
            else {
                con = false;
            }

        }

        con = true;

        if (ans.toString() == ""){
            return "";
        }

        for (int i = 2 ; i < strings.length ; i++){
            for (int j = 0 ; j < Math.min(ans.length(), strings[i].length()) ; j++){


                if (ans.charAt(j) == strings[i].charAt(j) && con){
                    sna.append(ans.charAt(j));
                }
                else if (ans.charAt(j) != strings[i].charAt(j) && i != 0){
                    con = false;
                }

            }
            con = true;
            ans.setLength(0);
            ans.append(sna.toString());
            sna.setLength(0);


        }

        return ans.toString();

    }
}
