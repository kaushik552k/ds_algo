import java.util.Arrays;

public class selection_Sort {
    public static void main(String[] args) {
        int[] a = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = a.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (a[i] > a[largestIndex])
                    largestIndex = i;
            }
            swap(a, largestIndex, lastUnsortedIndex);
        }
        System.out.println(Arrays.toString(a));
    }

    public static void selection_Sort() {

    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
