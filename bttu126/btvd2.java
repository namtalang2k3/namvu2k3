package bttu126;

import java.util.Scanner;

public class btvd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào một chuỗi bất kỳ:");
        String chuoiNhap = sc.nextLine();

        int kyTuThuong = 0;
        int kyTuHoa = 0;
        int soKyTu = 0;

        for (int i = 0; i < chuoiNhap.length(); i++) {
            char kyTu = chuoiNhap.charAt(i);
            if (Character.isLowerCase(kyTu)) {
                kyTuThuong++;
            } else if (Character.isUpperCase(kyTu)) {
                kyTuHoa++;
            } else if (Character.isDigit(kyTu)) {
                soKyTu++;
            }
        }

        System.out.println("Số ký tự thường: " + kyTuThuong);
        System.out.println("Số ký tự hoa: " + kyTuHoa);
        System.out.println("Số ký tự số: " + soKyTu);

        sc.close();
    }
}