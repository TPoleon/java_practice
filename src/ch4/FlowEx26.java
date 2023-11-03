package ch4;

public class FlowEx26 {
    public static void main(String[] args) {
        int sum = 0, i = 0;

        System.out.println("i  sum");

        while ((sum += ++i) <= 100) {
            System.out.printf("%d - %d%n", i, sum);
        }
    }
}
