abstract class Super {
    public Super() {
        System.out.println("Super Construction");
    }
    public void meth1(){
        System.out.println("Meth1 of super");
    }
    abstract public void meth2();
}

class Sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Meth2 of Sub");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Super s = new Sub();
        s.meth1();
        s.meth2();
    }
}