package src;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        String zero = map.get(0);
        String one = map.get(1);
        System.out.println(zero);
        System.out.println(one);

    }
}
