public class Q3 {
    public static void main(String[] args) {
        Q3 mac = new Q3();
        int[] arr = {2, 1};
        boolean isValidMountain = mac.validMountainArray(arr);

        System.out.println("Is valid mountain array: " + isValidMountain);
    }
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int i = 0;
        int n = arr.length;

        // Check increasing sequence
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Check peak existence
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Check decreasing sequence
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}
