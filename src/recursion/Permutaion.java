package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutaion {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(findPermu(s));
    }
    public static List<String> findPermu(String s)
    {
        if(s.length()==0)
        {
            List<String> base=new ArrayList<>();
            base.add("");
            return base;
        }

        char cc=s.charAt(0);
        String rem=s.substring(1);
        List<String> recRes = findPermu(rem);
        List<String> res=new ArrayList<>();
        //fetching rec res
        for(String cs:recRes)
        {
            for(int i=0;i<=cs.length();i++)
            {
                String val = cs.substring(0, i) + cc + cs.substring(i);
                res.add(val);
            }
        }

        return res;

    }
}
