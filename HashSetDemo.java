package dailywork;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args){
        HashSet<String> Hashset = new HashSet<String>();
        Hashset.add("A");
        Hashset.add("B");
       boolean r1 = Hashset.add("c");
       boolean r2 = Hashset.add("c");
        System.out.println(Hashset);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println( "Hashset contanins c or mot            "  + Hashset.contains("c"));
        Hashset.remove("A");
        for(String item : Hashset){
            System.out.println(item);
        }

    }
}
