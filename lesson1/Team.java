package lesson1;
//Created by: Andrey Svyatkin
import lesson1.Animal.Cat;
import lesson1.Animal.Dog;
import lesson1.Obstacles.Obstacle;

public class Team {
    private String name;
    private Participant participants[] ;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name,Participant ... participantsGiven ) {
        this.name = name;
        this.participants = participantsGiven;
    }

    public void getTeamInfo() {
        System.out.println("======Название команды======");
        System.out.println(this.name );
        System.out.println("======Участники======");
        for (Participant participant : participants) {
            if (participant instanceof Dog) {
                System.out.println("Собака: " + participant.getName());
            }
            if (participant instanceof Cat) {
                System.out.println("Кот: " + participant.getName());
            }
            if (participant instanceof Robot) {
                System.out.println("Робот: " + participant.getName());
            }
        }
    }

    public void showResults(){
        for (Participant participant : participants) {
            if (!participant.isOnDistance()) {
                break;
            }
        }
    }
    public void doIt(Obstacle obstacle){
        for (Participant participant : participants) {
            obstacle.doIt(participant);
        }
    }
}
