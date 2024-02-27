//if a interface is having a single method then it is known as functional interface

interface Test {
    void method1();
    void method2();
}

class My implements Test {
    public void method1() {
        System.out.println("Method 1 of class My");
    }
    public void method2() {
        System.out.println("Method 2 of class My");
    }
    public void method3() {
        System.out.println("Method 3 of class My");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Test t = new My();
        My m = new My();
        t.method1();
        t.method2();
        m.method1();
        m.method2();
        m.method3();
    }
}
