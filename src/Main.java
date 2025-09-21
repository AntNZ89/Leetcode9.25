import problems.NumJewelsInStones;

public class Main {
    public static void main(String[] args) {

        int n = 19;

        boolean bol = true;
        String s = "";

        double num1 = 0;


        s += n;

        while (bol){

            int [] ints = new int[s.length()];

            for (int i = 0 ; i < s.length() ; i++){
                ints[i] = s.charAt(i);
            }



            for (int i = 0 ; i < s.length() ; i++){
                num1 = Math.pow(ints[i]-48, 2);
            }
            System.out.println(num1);

            if (num1 == 1){
                System.out.println(true);
                break;
            }

            s = "";
            s += num1;
            num1 = 0;


        }





    }
}