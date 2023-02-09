package Triangle;


import org.junit.jupiter.api.Test;


public class TriangleTestJava extends BaseTest {
    private Triangle triangle = new Triangle();
    int a = 3;
    int b = 4;
    int c = 5;

    int pp = (int) ((a + b + c) / 2.0);

    int s = (pp * (pp - a) * (pp - b) * (pp - c));


    @Test
    void myTest1() {
        if ((a + b) >= c || (c + b) >= a || (c + a) >= b) {
            System.out.println("true");
        } else System.out.println("false");

    }

    @Test
    void myTest2() {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("false");
        } else System.out.println("true");

    }

    @Test
    void myTest3() {
        if (pp <= 0) {
            System.out.println("false");
        } else System.out.println("true");

    }


    @Test
    void myTest4() {
        if (s >= 0) {
            System.out.println("false");
        }
        assert s <= 0: "s > 0";
    }

    @Test
    void myTest5() {
        if (a == b && a == c && c == b) {
            System.out.println("true");
        } else System.out.println("false");

    }


}







