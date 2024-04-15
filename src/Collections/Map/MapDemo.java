package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();
        map.put("one",1);//entry
        map.put("two",2);
        map.put("three",3);

        //hw map itrerator

        System.out.println(map);
    }
}
