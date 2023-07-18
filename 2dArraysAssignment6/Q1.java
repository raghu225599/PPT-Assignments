import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        Q1 reconstructor = new Q1();
        String s = "IDID";
        int[] perm = reconstructor.findPermutation(s);
        System.out.println(Arrays.toString(perm));
    }
    public int[] findPermutation(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];
        int min = 0;
        int max = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = min++;
            } else {
                perm[i] = max--;
            }
        }

        perm[n] = min;
        return perm;
    }

}
