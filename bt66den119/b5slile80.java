// Bài 5: Lập chương trình phân loại học sinh theo điểm sử
// dụng cấu trúc switch. Điểm nhập vào là các số nguyên từ
// 0 đến 10. Phân loại như sau:
// ▪ Điểm 0, 1, 2, 3: Xếp loại Kém
// ▪ Điểm 4: Loại Yếu
// ▪ Điểm 5, 6: Loại Trung bình
// ▪ Điểm 7, 8: Loại Khá
// ▪ Điểm 9, 10: Loại Giỏi
package bt66den119;

import java.util.Scanner;

public class b5slile80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vào diem cua học sinh : ");
        int diem = sc.nextInt();
        switch (diem) {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("day la hoc sinh kem");
                break;
            case 4:
                System.out.println("day la hoc sinh yeu");
                break;
            case 5:
            case 6:
                System.out.println("day la hoc sinh trung binh");
                break;
            case 7:
            case 8:
                System.out.println("day la hoc sinh kha");
                break;
            case 9:
            case 10:
                System.out.println("day la hoc sinh gioi");
                break;
            default:
                System.out.println("diem khong hop le");
                break;

        }
        sc.close();
    }

}
