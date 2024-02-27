import java.lang.Object;

class MyObject {
    public String toString() {
        return "My Object";
    }

    public int hashCode() {
        return 100;
    }

    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }
}
public class ObjectClass {
    public static void main(String[] args) {
        MyObject m = new MyObject();
        Object o1 = new Object();
        Object o2 = o1;

        System.out.println(o1); //it will call toString() method automatically
        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode());

        System.out.println(m.toString());
        System.out.println(m.hashCode());
    }
}
