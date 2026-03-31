

public class MThreading {

    static class Thread1 implements Runnable{
        @Override
        public void run() {
            System.out.println("Thread1 running " + Thread.currentThread().getState());
        }
    }

    static class Thread2 implements Runnable{
        @Override
        public void run() {
            System.out.println("Thread2 running" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());

        System.out.println(t1.getState());

        t1.start();

        t1.join();

        System.out.println(t1.getState());

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName());

        System.out.println(t2.isAlive());

        System.out.println(t1.getState());
    }
}
