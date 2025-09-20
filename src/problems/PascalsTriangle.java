package problems;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> listList = new ArrayList<>(numRows);
        List<Integer> intList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        List<Integer> help = new ArrayList<>();


        for (int i = 0 ; i < numRows ; i++){
            if (i == 0){
                intList.add(1);
                listList.add(new ArrayList<>(intList));
            }
            else {
                for (int k = 0 ; k <= i ; k++){
                    if (k == 0 || k == i){
                        tempList.add(1);
                        if (k == i){
                            intList.clear();
                            intList.addAll(tempList);
                            listList.add(new ArrayList<>(intList));
                            tempList.clear();
                        }
                    }
                    else {
                        int num = intList.get(k-1) + intList.get(k);
                        tempList.add(num);
                        num = 0;
                    }
                }

            }


        }

        return listList;


    }
}
