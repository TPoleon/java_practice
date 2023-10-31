package ch7;

public class PointTest2 {
    public static void main(String[] args) {
        Point2_3D p3 = new Point2_3D();
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.y=" + p3.y);
        System.out.println("p3.z=" + p3.z);
    }
}

class Point2 {
    int x = 10;
    int y = 20;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point2_3D extends Point2 {
    int z = 30;

    Point2_3D() {
        this(100, 200, 300);  // Point3D(int x, int y, int z)을 호출한다.
    }

    Point2_3D(int x, int y, int z) {
        super(x, y); // Point(int x, int y)를 호출한다.
        this.z = z;
    }
}
