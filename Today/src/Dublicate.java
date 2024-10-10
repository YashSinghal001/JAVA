public class Dublicate {
    public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int uniqueIndex = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex - 1]) {
                arr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }

    public static void main(String[] args) {
        int[] arr = {20, 20, 30, 40, 50, 50, 50};
        int newLength = removeDuplicates(arr);
        System.out.println("New array length: " + newLength);
    }
}