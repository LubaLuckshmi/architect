package seminar6.essences;

import java.util.List;

public class ZooApp {
    public static void main(String[] args) {
// Создаем репозиторий для животных
        AnimalRepository repository = new InMemoryAnimalRepository();

// Создаем сервис для работы с животными
        AnimalService service = new AnimalService(repository);

// Добавляем животных
        service.addAnimal("Лев", "Млекопитающее", 5);
        service.addAnimal("Зебра", "Млекопитающее", 3);
        service.addAnimal("Попугай", "Птица", 1);

// Получаем список всех животных и выводим на экран
        List<Animal> animals = service.getAllAnimals();
        for (Animal animal : animals) {
            System.out.println("ID: " + animal.getId());
            System.out.println("Имя: " + animal.getName());
            System.out.println("Вид: " + animal.getSpecies());
            System.out.println("Возраст: " + animal.getAge());
            System.out.println();
        }
    }
}
