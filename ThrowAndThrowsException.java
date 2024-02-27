class NegativeDimensionException extends Exception {
    public String toString() {
        return "Dimensions of a Rectangle cannot be Negative";
    }
}
public class ThrowAndThrowsException {
    public static int meth1() {
        return 10/0;
    }

    public static void meth2() {
        meth1();
    }

    public static void meth3() {
        meth2();
    }

    public static int area(int l, int b) throws Exception {
        if(l < 0 || b < 0) {
            throw new Exception();
        }
        return l * b;
    }

    public static void meth4() throws Exception {
        System.out.println("Area is " + area(10,5));
    }
    public static void main(String[] args) throws Exception {
        try {
            meth3();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        try {
            meth4();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
