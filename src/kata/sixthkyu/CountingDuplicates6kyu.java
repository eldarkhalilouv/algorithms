package kata.sixthkyu;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates6kyu {
    public static void main(String[] args) {
        String dup = "asdufhafhuafhusdfhasnhfnashdf";
        System.out.println(countDuplicates(dup));
    }

    public static int countDuplicates(String str) {
        str = str.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int duplicates = 0;
        for (int count : map.values()) {
            if (count > 1) {
                duplicates++;
            }
        }

        return duplicates;
    }
}
