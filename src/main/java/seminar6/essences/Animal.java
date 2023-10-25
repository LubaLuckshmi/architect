package seminar6.essences;

import java.util.List;

// Уровень сущностей (Entities)
class Animal {
    private int id;
    private String name;
    private String species;
    private int age;

    public Animal(int id, String name, String species, int age) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }
}

// Уровень интерфейсов (Interfaces)
interface AnimalRepository {
    void addAnimal(Animal animal);
    List<Animal> getAllAnimals();
}

// Уровень бизнес-логики (Use Cases)
class AnimalService {
    private AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }

    public void addAnimal(String name, String species, int age) {
        Animal animal = new Animal(0, name, species, age);
        repository.addAnimal(animal);
    }

    public List<Animal> getAllAnimals() {
        return repository.getAllAnimals();
    }
}

// Уровень представления (не реализован в данном примере)

