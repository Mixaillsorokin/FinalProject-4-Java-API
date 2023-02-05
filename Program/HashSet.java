import java.util.HashMap;

public class HashSet {
    private static HashMap<Integer, Object> hashMap = new HashMap<>();
    private static final Object OBJECT = new Object();

    public static void main(String[] args) {
        add(1);
        add(3);
        add(9);
        add(7);
        add(11);
        add(11);
        
        System.out.println(getString());
        System.out.println(getEmpty());
        hashMap.forEach((k, v) -> System.out.print(k + " "));

    }

    private static void add(int element) {
        hashMap.put(element, OBJECT);
    }

    private static String getString() {
        return hashMap.keySet().toString();
    }

    private static Boolean getEmpty() {
        return hashMap.isEmpty();
    }

}
