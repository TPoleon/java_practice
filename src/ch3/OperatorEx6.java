package ch3;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        // byte c = a + b; 에러 발생.
        byte c = (byte) (a + b);
        System.out.println(c);
    }
}
