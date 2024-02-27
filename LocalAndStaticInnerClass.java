class Outer {
    /*Local Inner class
    public void display() {
        class Inner {
            public void show() {
                System.out.println("Hello");
            }
        }
        Inner i = new Inner();
        i.show();
    } */

    /*Anonymous Inner Class
    public void display() {
        My m = new My() {
            public void show() {
                System.out.println("Hello");
            }
        };
        m.show();
    } */

    //Static Inner Class
    int x = 10;
    static int y = 20;

    static class My {
        public void show() {
            System.out.println(y);
        }
    }
}

/*abstract class My {
    abstract public void show();
} */

interface My {
    public void show();
}
public class LocalAndStaticInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        //o.display();
        Outer.My m = new Outer.My(); //For Static Inner class accessing
        m.show();
    }
}
