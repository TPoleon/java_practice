package ch4;

public class FlowEx {
  public static void main(String[] args) {
    int num = 1;
    char result = 'ㅁ';
    final int ONE = 1;

    switch(result) {
      case '1':
        System.out.printf("1");
      case ONE:
        System.out.printf("ONE");
      case 3:
        System.out.printf("YES");
      case 4:
        System.out.printf("num");

    }
  }
}
