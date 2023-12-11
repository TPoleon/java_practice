package ch7;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        // car.water() 컴파일 에러 Car타입의 참조변수로는 Water()를 호출 할 수 없다.
        fe2 = (FireEngine) car;  // 자손타입 <ㅡ 조상타입
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }

    void stop() {   // 멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {  // 소방차
    void water() {
        System.out.println("water!!!");
    }
}