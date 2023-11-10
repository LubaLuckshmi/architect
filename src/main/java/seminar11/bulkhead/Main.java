package seminar11.bulkhead;
// Класс для запуска примера
public class Main {
    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool(3);

// Запускаем работников в пуле
       /* threadPool.execute(0); // Worker 1 is performing work.
        threadPool.execute(1); // Worker 2 is performing work.
        threadPool.execute(2); // Worker 3 is performing work.

// Попытка запустить несуществующего работника
        threadPool.execute(3); // Invalid worker index.*/

        Worker worker1 = new Worker("worker1");
        Worker worker2 = new Worker("worker2");
        Worker worker3 = new Worker("worker3");
        Worker worker4 = new Worker("worker4");

        worker1.doWork();
        worker2.doWork();
        worker3.doWork();
        worker4.doWork();
    }
}