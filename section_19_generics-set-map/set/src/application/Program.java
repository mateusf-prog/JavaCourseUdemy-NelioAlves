package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        // hashset does not guarantee the order of the items, but it is faster
        Set<String> set = new HashSet<>();

        set.add("tv"); 
        set.add("notebook");
        set.add("tablet");

        set.remove("tablet");

        set.removeIf(x -> x.length() >= 3);
        set.removeIf(x -> x.charAt(0) == 'T'); // predicate
        
        for (String p : set) {
            System.out.println(p);
        }

        System.out.println("\n");

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,3,8,1,0,9));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,7,6,0,8,2));

        // UNION a and b
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        // INTERSECTION of all the elements that exist between a and b
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        // DEFFERENCE 
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
