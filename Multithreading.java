/*class MyThread extends Thread { //Multithreading using thread method
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }
} */

class MyThread implements Runnable { //Multithreading using Runnable method
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }
}

public class Multithreading extends Thread {

    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        MyThread m = new MyThread(); // it is same for both thread and runnable
        Thread t = new Thread(m); // for running runnable because it is just and interface it will not run bu its own, so to run it will have to use thread then it will start the program
        Multithreading mt = new Multithreading();
        mt.start();
        //m.start(); // it is only for running of the thread
        t.start();
        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }
    }
}
