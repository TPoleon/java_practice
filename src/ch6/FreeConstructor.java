package ch6;

class Car0 {
    String color; // 색상
    String gearType;  // 변속기 종류 - auto, manual
    int door;

    Car0() {
        color = "black";
        gearType = "none";
        door = 1;

    }

    Car0(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

class FreeConstructor {
    public static void main(String[] args) {
        Car0 c1 = new Car0();
        Car0 c2 = new Car0("blue", "manual", 2);

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);

    }
}

