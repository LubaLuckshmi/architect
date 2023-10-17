package seminar2.prototype;
// Абстрактный класс Прототипа
abstract class Animal implements Cloneable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Абстрактный метод клонирования
    public abstract Animal clone();
}

// Конкретный класс животного (Прототип)
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Реализация метода клонирования для собаки
    @Override
    public Animal clone() {
        return new Dog(this.getName());
    }
}

// Конкретный класс животного (Прототип)
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Реализация метода клонирования для кошки
    @Override
    public Animal clone() {
        return new Cat(this.getName());
    }
}

public class Main {
    public static void main(String[] args) {
// Создаем собаку и кошку (оригинальные объекты)
        Dog originalDog = new Dog("Buddy");
        Cat originalCat = new Cat("Whiskers");

// Клонируем собаку и кошку
        Dog clonedDog = (Dog) originalDog.clone();
        Cat clonedCat = (Cat) originalCat.clone();

// Выводим имена клонированных животных
        System.out.println("Cloned Dog's Name: " + clonedDog.getName());
        System.out.println("Cloned Cat's Name: " + clonedCat.getName());
    }
}