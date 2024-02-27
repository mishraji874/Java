class MyRun implements Runnable {
    public void run() {}
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        setPriority(Thread.MIN_PRIORITY + 2);
    }

    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRun());
        MyThread m = new MyThread("My Thread 1");
        m.start();
        System.out.println(m.getId());
        System.out.println(m.getName());
        System.out.println(m.getPriority());
        System.out.println(m.getState());
        System.out.println(m.isAlive());
    }
}
