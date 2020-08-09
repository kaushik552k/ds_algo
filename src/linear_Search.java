import java.util.Arrays;
import java.util.Scanner;

public class linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {12, 4, 7, 23, 66, 45};
        System.out.println(Arrays.toString(a));
        System.out.println("Enter the value you want to search");
        int search_value = sc.nextInt();
        int search_index = linearSearch(a, search_value);
        if (search_index == -1)
            System.out.println("not found");
        else
            System.out.println( search_index );
    }

    private static int linearSearch(int[] a, int search_value){
        for (int i = 0; i < a.length; i++) {
            if(a[i] == search_value) {
                return i;
            }
        }
        return -1;
    }
}
