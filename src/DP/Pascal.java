package DP;

import java.util.ArrayList;
import java.util.List;

public class Pascal {

    public static void main(String[] args) {

        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> subList=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            subList.add(0,1);
            for(int j=1;j<subList.size()-1;j++)
            {
                subList.set(j,subList.get(j)+subList.get(j+1));
            }
            res.add(new ArrayList<Integer>(subList));
        }
        return res;
    }
}
