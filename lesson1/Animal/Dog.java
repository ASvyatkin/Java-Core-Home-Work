package lesson1.Animal;
//Created by: Andrey Svyatkin
public class Dog extends Animal {

    public Dog(String name, int maxRunDistance,
               int maxJumpHeight, int maxSwimDistance) {
        super(name, maxRunDistance, maxJumpHeight, maxSwimDistance);
    }

    @Override
    public void voice() {
        System.out.println("Гав");
    }

    public void swim() {
        System.out.println(getName() + " плывет");
    }
}
