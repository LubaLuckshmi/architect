package seminar6.patterns.composite;
import java.util.ArrayList;
import java.util.List;

// Интерфейс для животных
interface IAnimalDecriber {
    void describe();
}

// Реализация базового интерфейса для животных
class BasicAnimal implements IAnimalDecriber {
    private String description;

    public BasicAnimal(String description) {
        this.description = description;
    }

    @Override
    public void describe() {
        System.out.println(description);
    }
}

// Класс для группы животных (композиция)
class AnimalGroup implements IAnimalDecriber {
    private List<IAnimalDecriber> animals = new ArrayList<>();

    public void addAnimal(IAnimalDecriber animal) {
        animals.add(animal);
    }

    @Override
    public void describe() {
        for (IAnimalDecriber animal : animals) {
            animal.describe();
        }
    }
}

public class Main {
    public static void main(String[] args) {
// Создаем отдельных животных
        BasicAnimal lion = new BasicAnimal("Лев");
        BasicAnimal elephant = new BasicAnimal("Слон");

// Создаем группу животных и добавляем в нее отдельных животных
        AnimalGroup animalGroup = new AnimalGroup();
        animalGroup.addAnimal(lion);
        animalGroup.addAnimal(elephant);

// Выводим описание отдельных животных и группы
        System.out.println("Отдельные животные:");
        lion.describe();
        elephant.describe();

        System.out.println("\nГруппа животных:");
        animalGroup.describe();
    }
}