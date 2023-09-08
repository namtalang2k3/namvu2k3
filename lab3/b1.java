package lab3;

public class b1 {

    public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println(i); // "4"
        ++i;
        System.out.println(i); // "5"
        System.out.println(++i); // "6" cộng 1 vào 5 trước sau đó in ra kết quả là 6
        System.out.println(i++); // "6" in ra kết quả rồi mới cộng 1 vô 6
        System.out.println(i); // "7"
    }

}
