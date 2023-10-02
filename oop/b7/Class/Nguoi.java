package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoten;
    protected Date ngaysinh;
    protected String quequan;

    // phuong thuc
    // ham khoi tao khong doi
    public Nguoi() {

    }

    // ham khoi tao co doi so
    public Nguoi(String hoten, Date ngaysinh, String quequan) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
    }

    public void nhapthongtin(Scanner sc) {
        System.out.println("\tNhap ho va ten: ");
        sc.nextLine();
        hoten = sc.nextLine();
        System.out.println("\tNhap ngay sinh: ");
        String strDate = sc.nextLine();
        ngaysinh = strToDate(strDate);
        System.out.println("\tNhap que quan: ");
        quequan = sc.nextLine();

    }

    private Date strToDate(String strDate) {
        Date date = null;

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = sdf.parse(strDate);
        } catch (ParseException e) {
            System.out.println("loi dinh dang ngay thang!");
        }

        return date;
    }

    // ham hien thi
    public void hienthi() {
        System.out.println("/tHoten" + hoten);
        System.out.println("/Ngaysinh" + ngaysinh);
        System.out.println("/tQuequan" + quequan);
    }
    // ham lay ra que quan

    public String getQuequan() {
        return quequan;
    }

    // ham lay ra thong tin ve ngay sinh

    public Date getNgaysinh() {
        return ngaysinh;
    }

}
