package problems;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> temp = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0 ; i <= rowIndex ; i++){

            if (i == 0){
                list.add(1);
            }

            for (int k = 0 ; k <= i ; k++){

                if (k == 0 || k == i){
                    temp.add(1);
                }
                else {
                    int num = list.get(k-1) + list.get(k);
                    temp.add(num);
                }
            }

            list.clear();
            list.addAll(temp);
            temp.clear();

        }

        return list;

    }
}
