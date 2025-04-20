package kata.sixthkyu;

import java.util.Arrays;

public class FindTheUniqueNumber6kyu {
    public static void main(String[] args) {
        double[] doubles = new double[]{ 0, 0, 0.55, 0, 0 };
        double[] doubles2 = new double[]{ 1, 1, 1, 2, 1, 1 };
        System.out.println(findUniq(doubles)); // should 0.55
        System.out.println(findUniq(doubles2)); // should 2
    }

    // It’s guaranteed that array contains at least 3 numbers.
    public static double findUniq(double[] doubles) {
        Arrays.sort(doubles);
        return doubles[0] == doubles[1] ? doubles[doubles.length - 1] : doubles[0];
    }
}
