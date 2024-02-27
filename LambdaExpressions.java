@FunctionalInterface //if a interface is having a single method then it is known as functional interface
interface MyLambda {
    //public void display();
    public void display(String str); // Parameter lambda method
    //public int add(int x, int y);
}

/*class My implements MyLambda {
    public void display() {
        System.out.println("Hello World");
    }
} */

/*class Demo {
    int temp = 10;
    public void method1() {
        int count = 0;
        MyLambda ml = ()->{
            int x = 0;
            System.out.println("Hi");
            System.out.println("Bye" + (++temp));
        };
        ml.display();
    }

    public void method2() {
        UseLambda ul = new UseLambda();
        ul.callLambda(()->{System.out.println("Hello");});
    }
}

class UseLambda {
    public void callLambda(MyLambda ml) {
        ml.display();
    }
} */

public class LambdaExpressions {

    public void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String[] args) {
        //My m = new My();
        //MyLambda m = () ->{System.out.println("Hello World");}; 
        //m.display();
        //MyLambda m = (s) ->{System.out.println(s);}; // Parameter In Lambda
        //m.display("Hello World");
        //MyLambda m = (a, b) -> a + b;
        //System.out.println(m.add(20, 30));
        //Demo d = new Demo();
        //d.method1();
        //d.method2();

        //MyLambda ml = System.out::println;
        //ml.display("Hello");

        LambdaExpressions le = new LambdaExpressions();
        MyLambda ml = le::reverse;
        ml.display("Hello");

    }
}
