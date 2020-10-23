package test;

public class SynchronizedTest {
    public static void main(String[] args) {
        SynchronizedTest.testA();
    }

    public static  synchronized  void testA() {
        System.out.println("你好");
    }
}
