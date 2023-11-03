package ch2;

public class CharToCode {
    public static void main(String[] args) {
        char ch1 = 'A'; // char ch1 =65;
        int code1 = (int) ch1; // ch1에 저장된 값을 int타입으로 변환하여 저장한다.

        System.out.printf("%c=%d(%#X)%n", ch1, code1, code1);


        char ch2 = 'a'; // char ch2 =97;
        int code2 = (int) ch2; // ch2에 저장된 값을 int타입으로 변환하여 저장한다.
        System.out.printf("%c=%d(%#X)%n", ch2, code2, code2);


        char ch3 = '가'; // char ch3 = 0xAC00;
        int code3 = (int) ch3;
        System.out.printf("%c=%d(%#X)%n", ch3, code3, code3);
        System.out.printf("%c=%d(%#X)%n", ch3, (int) ch3, (int) ch3);
    }
}