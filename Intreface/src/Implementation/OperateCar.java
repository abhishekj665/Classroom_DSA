package Implementation;

public interface OperateCar {

    void start();

    void stop();

}

interface PlayMusic {

    void play();

    void next();

    void sound();
}

class Player implements PlayMusic{

    public void play(){
        System.out.println("Music Playing");
    }

    public void next(){
        System.out.println("Next Played");
    }

    public void sound(){
        System.out.println("Sound increases");
    }
}

class Car extends Player implements OperateCar {


    boolean upSpeed;



    @Override
    public void start() {
        System.out.println("Car is start and running");
    }

    @Override
    public void stop() {
        System.out.println("Car is stop");
    }


    public void upSpeed(boolean speed) {
        if(upSpeed){
            System.out.println("Speed is already up");
        }else{
            System.out.println("Speed is up");
            this.upSpeed = speed;
        }
    }


    public static void main(String[] args) {
        Car c = new Car();

        c.start();
        c.upSpeed(true);
        c.stop();
        c.play();
        c.upSpeed(true);
        c.sound();
        c.next();
    }




}

