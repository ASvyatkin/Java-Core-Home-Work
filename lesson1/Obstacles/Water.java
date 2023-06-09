package lesson1.Obstacles;
//Created by: Andrey Svyatkin
import lesson1.Participant;

public class Water extends Obstacle {

    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(length);
    }
}
