import java.io.FileInputStream;

class LowBalanceException extends Exception {
    public String toString() {
        return "Balance should not be less than 5000";
    }
}
public class CheckedUncheckedException {
    public static void fun1() {
        try {
            System.out.println(10/0);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            throw new LowBalanceException();
        } catch (LowBalanceException e) {
            System.out.println(e);
        }
    }

    public static void fun2() {
        fun1();
    }

    public static void fun3() {
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
