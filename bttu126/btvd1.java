package bttu126;

import java.util.Scanner;

public class btvd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao chuỗi ko quá 80 ký tự :");
        String input = sc.nextLine();

        System.out.println("nhap vao ký tự bất kỳ :");
        char targetchar = sc.next().charAt(0);

        int soLanXuatHien = dem(input, targetchar);
        System.out.println("Số lần xuất hiện của ký tự '" + targetchar + "': " + soLanXuatHien);

        String chuoiVietHoa = biendoi(input);
        System.out.println("Chuỗi sau khi chuyển thành chữ in hoa: " + chuoiVietHoa);

        sc.close();
    }

    public static int dem(String str, char targetchar) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetchar) {
                count++;
            }
        }
        return count;
    }

    public static String biendoi(String str) {
        String[] keywork = str.split(" ");
        StringBuilder ketqua = new StringBuilder();
        for (String work : keywork) {
            if (!work.isEmpty()) {
                ketqua.append(Character.toUpperCase(work.charAt(0))).append(work.substring(1)).append(" ");
            }

        }
        return ketqua.toString();
    }

}
