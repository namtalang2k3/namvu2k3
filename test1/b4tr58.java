
package test1;

public class b4tr58 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 0;

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            double x = -b / (2.0 * a); // Chú ý: sử dụng 2.0 để thực hiện phép chia thực (double)
            System.out.println("Phương trình có nghiệm kép: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
