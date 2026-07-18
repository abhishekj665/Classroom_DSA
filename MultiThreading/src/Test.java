public class Test {



    public static void main(String[] args) {

        Counter counter = new Counter();
        Main t1 = new Main(counter);
        Main t2 = new Main(counter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        counter.getCount();

    }
}
