//Generic is nothing but only and only using of Template functions in C++

class Data<T> {
    private T obj;

    public void setData(T v) {
        obj = v;
    }
    public T getData() {
        return obj;
    }
}

class MyArray<T> {
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        A[length++] = v;
    }
    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}
public class Generics {

    static <E> void show(E[] list) {
        for (E x : list) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        //Object obj = new String("Hello");
        //obj = new Integer(10);
        //String st = (String) obj;

        //Object obj = new Integer(10);
        //Integer st = (Integer) obj;
        //System.out.println(st);

        /*Object obj[] = new Object[3];

        obj[0] = "hi";
        obj[1] = "bye";
        obj[2] = new Integer(10);

        String str;

        for (int i = 0; i < 3; i++) {
            str = (String)obj[i];
            System.out.println(str);
        } */

        Data<Integer> d = new Data<>();
        d.setData(10);

        System.out.println(d.getData());

        MyArray<Integer> m = new MyArray<>();
        m.append(10);
        m.append(20);
        m.append(30);
        m.display();

        show(new String[] {"Hi", "Go", "Bye"});
        show(new Integer[] {10,20,30,40});
    }
}