import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Thursday {
    public static void main(String[] args) {
        // HashMap
        HashMap<String, Integer> hm = new HashMap<>();
        // // put -- Inserts the values into Hashmap -- put(key,value)
        // remove()
        // // get(object,key)
        // // containsKey(object key)
        // // containsValue(object key)
        hm.put("Name", 6);
        hm.put("regno.", 41815);
        System.out.println(hm);
        hm.remove("Name");
        System.out.println("HashMap is :" + hm);
        // LinkedHashMap
        LinkedHashMap<Integer, String> lh = new LinkedHashMap<>();
        lh.put(1, "Manoj");
        lh.put(2, "Sai");
        System.out.println("Linked Hash Map is : " + lh);
        // Hashtable
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Hello");
        ht.put(2, "Good Morning !!");
        System.out.println("Hash Table is: " + ht);
        // TreeMap
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "Hello");
        tm.put(2, "Good Morning !!");
        tm.put(3, "Manoj");

        System.out.println("Tree Map is: " + tm);
        System.out.println(tm.containsKey(1));

    }

}
