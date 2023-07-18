import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**Question 6**

        An integer array original is transformed into a **doubled** array changed by appending **twice the value** of every element in original, and then randomly **shuffling** the resulting array.

        Given an array changed, return original *if* changed *is a **doubled** array. If* changed *is not a **doubled** array, return an empty array. The elements in* original *may be returned in **any** order*.

        **Example 1:**

        **Input:** changed = [1,3,4,2,6,8]

        **Output:** [1,3,4]

        **Explanation:** One possible original array could be [1,3,4]:

        - Twice the value of 1 is 1 * 2 = 2.
        - Twice the value of 3 is 3 * 2 = 6.
        - Twice the value of 4 is 4 * 2 = 8.

        Other original arrays could be [4,3,1] or [3,1,4].
 */
public class Q6 {
    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);

        System.out.print("Original array: ");
        for (int num : original) {
            System.out.print(num + " ");
        }
    }
    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0]; // If the length is odd, it can't be a doubled array
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : changed) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(changed);
        int[] original = new int[changed.length / 2];
        int index = 0;

        for (int num : changed) {
            if (freqMap.getOrDefault(num, 0) > 0) {
                if (freqMap.getOrDefault(2 * num, 0) > 0) {
                    original[index] = num;
                    freqMap.put(num, freqMap.get(num) - 1);
                    freqMap.put(2 * num, freqMap.get(2 * num) - 1);
                    index++;
                } else {
                    return new int[0]; // If 2*num doesn't exist, it can't be a doubled array
                }
            }
        }

        return original;
    }
}
