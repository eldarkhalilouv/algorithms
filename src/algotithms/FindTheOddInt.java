package algotithms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindTheOddInt {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,1,3,4,2,4,4};
        System.out.println(findOddInt(array));
    }

    public static int findOddInt(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : arr) map.put(num, map.getOrDefault(num, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) return entry.getKey();
        }

        return 0;
    }
}
