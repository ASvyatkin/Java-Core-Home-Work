package lesson1.Obstacles;
//Created by: Andrey Svyatkin
import lesson1.Team;

public class Course {
    private final Obstacle[] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }
    public void doIt(Team team){
        for (Obstacle obstacle : obstacles) {
            team.doIt(obstacle);
        }
    }
}
