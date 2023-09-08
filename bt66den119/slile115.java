package bt66den119;

public class slile115 {
    public static void main(String[] args) {
        int a[] = { 4, 1, 1, 6, 7, 3, 5 };
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("gia tri lon nhat la " + max);
    }
}
