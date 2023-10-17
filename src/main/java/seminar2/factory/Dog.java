package seminar2.factory;

// Подкласс Dog (собака)
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }
}
