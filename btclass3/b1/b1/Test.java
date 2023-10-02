package btclass3.b1.b1;

public class Test {

    private String hovaten;
    private int namsinh;

    public Test(String hovaten, int namsinh) {
        this.hovaten = hovaten;
        this.namsinh = namsinh;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public void an() {
        System.out.println("măm măm ");
    }

    public void uong() {
        System.out.println("ực ực ");
    }

    public void ngu() {
        System.out.println("khò khò ");
    }

    public static void main(String[] args) {
        System.out.println("Kiểm tra : ");
        Test cn = new Test("LAm", 2021);
        cn.an();
        cn.uong();
        cn.ngu();

        HocSinh hs = new HocSinh("LAM", 2021, "lop 1", "truog 1");
        hs.an();
        hs.uong();
        hs.ngu();
        hs.lambaitap();
    }
}
