class Parent {
    public void display(){}
}

class Child extends Parent {
    @Override // used to override any function which is present in any other class
    public void display(){}
}

class OldClass {
    public void display() {
        System.out.println("Hello");
    }

    @Deprecated // for the use that this method is not suitable for working it may give some error so to remind me of that we will use deprecated
    public void show() {
        System.out.println("Hi");
    }
}

class My<T> {
    @SafeVarargs
    private void show(T...arg) {
        for (T x : arg) {
            System.out.println(x);
        }
    }
}

@FunctionalInterface
interface Me {
    public void show();
    public int add(int x, int y);
}

public class BuiltinAnnotations {
    @SuppressWarnings("deprecation") // used to supress the warnings
    public static void main(String[] args) {
        OldClass oc = new OldClass();
        oc.show();
    }
}
