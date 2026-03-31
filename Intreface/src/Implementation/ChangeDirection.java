package Implementation;

enum Direction{
    Left,
    Right
}

public interface ChangeDirection {

    void changeDirection(Direction direction);

}

class Omni implements ChangeDirection{

    Direction direction;

    public void changeDirection(Direction direction){
        this.direction = direction;
        System.out.println("The car is in now "+ direction + " direction");
    }

    public static void main(String[] args) {
        Omni o = new Omni();

        o.changeDirection(Direction.Left);
        o.changeDirection(Direction.Right);
    }

}
