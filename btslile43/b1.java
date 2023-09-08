package btslile43;

public class Hinhchunhat {
    public double chieudai;
    public double chieurong;

    public Hinhchunhat(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double tinhchuvi() {
        return 2 * (chieudai + chieurong);
    }

    public double tinhdientich() {
        return chieudai * chieurong;
    }
}

public class b1 {
    public static void main(String[] args) {
        Hinhchunhat hinhchunhat = new Hinhchunhat(5.0, 3.0);

        double chuvi = hinhchunhat.tinhchuvi();
        double dientich = hinhchunhat.tinhdientich();

        System.out.println("Chu vi hình chữ nhật là :" + chuvi);
        System.out.println("Dien tich hình chữ nhật là :" + dientich);
    }
}