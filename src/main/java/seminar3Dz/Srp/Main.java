package seminar3Dz.Srp;

//Программа 1: Принцип единственной ответственности (Single Responsibility Principle)

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Logger logger = new Logger();

        int result = calculator.add(5, 3);
        logger.log("The result is: " + result);
    }
}


    //В данной программе класс Calculator отвечает только за выполнение математических операций,
// а класс Logger отвечает только за логирование информации.
// Каждый класс имеет только одну ответственность, что соответствует принципу
// единственной ответственности
