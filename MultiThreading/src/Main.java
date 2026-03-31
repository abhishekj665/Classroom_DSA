import java.util.TreeMap;

public class Main extends Thread {

    private Counter counter;

    public Main(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {

        for(int i = 0; i < 1000; i++){
            counter.increment();
        }
    }

}
