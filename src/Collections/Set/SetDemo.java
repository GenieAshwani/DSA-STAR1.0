package Collections.Set;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
        List<Integer> al=new ArrayList<>();

        //add objet
        al.add(10);  //int-->Integer
        al.add(20);
        al.add(30);
        al.add(30);
        al.add(40);
        al.add(40);
        al.add(50);
        System.out.println(al);

        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(33);
        set.add(55);
        set.add(1);
        set.add(12122);
        System.out.println(set);

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }
}
