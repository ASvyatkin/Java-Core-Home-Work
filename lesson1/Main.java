package lesson1;
//Created by: Andrey Svyatkin
import lesson1.Animal.Cat;
import lesson1.Animal.Dog;
import lesson1.Obstacles.*;


public class Main {
    public static void main(String[] args) {

        Course c = new Course(new Obstacle[] {
                new Cross(5),
                new Wall(3),
                new Water(7)
        });
        Team team = new Team("Команда A",
                new Cat("Барсик", 10, 12, 0),
                new Dog("Мухтар", 20, 5, 15),
                new Cat("Мурзик", 9, 14, 0),
                new Robot("Валера", 50, 50, 50));
        team.getTeamInfo();
        System.out.println("=====Результат=====");

        c.doIt(team);
        team.showResults();

    }
}

