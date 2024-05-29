package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        String s="abc";
        List<String> subSequence = getSS(s);
        System.out.println(subSequence);
    }

    public static List<String> getSS(String s)
    {
       if(s.length()==0)
       {
           List<String> base= new ArrayList<>();
           base.add("");
           return base;
       }
       char cc=s.charAt(0);
       String rem=s.substring(1);
       List<String> recRes = getSS(rem);
       List<String> myRes=new ArrayList<>();
       for(int i=0;i<recRes.size();i++)
       {
           myRes.add(recRes.get(i));
           myRes.add(cc+recRes.get(i));
       }
       return myRes;
    }

}
