import java.util.Scanner;

class linearSearchPr2 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long sum = 0;
        long pre;
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > 0)
                sum += a[i];
        }
        if (sum == 0) {
            sum = (-1) * (long) Math.pow(10, 9);
            for (int i = 0; i < n; i++) {
                if (sum < a[i])
                    sum = a[i];
            }
            count = 1;
        }
        System.out.println(sum + " " + count);
    }
}