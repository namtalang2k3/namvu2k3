package btclass3.b1.b1;

public class HocSinh extends Test {
    private String tenlop, tentruong;

    public HocSinh(String hovaten, int namsinh, String tenlop, String tentruong) {
        super(hovaten, namsinh);
        this.tenlop = tenlop;
        this.tentruong = tentruong;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getTentruong() {
        return tentruong;
    }

    public void setTentruong(String tentruong) {
        this.tentruong = tentruong;
    }

    public void lambaitap() {
        System.out.println("... ... ...");
    }
}
