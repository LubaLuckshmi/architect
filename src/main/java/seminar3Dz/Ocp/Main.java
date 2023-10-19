package seminar3Dz.Ocp;

//Программа 2: Принцип открытости/закрытости (Open/Closed Principle)

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Rectangle(3, 4)};
        double totalArea = AreaCalculator.calculateTotalArea(shapes);
        System.out.println("Total Area: " + totalArea);
    }
}


   // В данной программе интерфейс Shape определяет метод calculateArea(),
// который должен быть реализован всеми классами-фигурами.
// Классы Circle и Rectangle реализуют этот метод, предоставляя свою особую формулу
// для расчета площади. Класс AreaCalculator принимает массив фигур и вычисляет их общую площадь,
// не завися от конкретных типов фигур. В случае добавления новой фигуры, нет необходимости
// изменять код в классе AreaCalculator. Таким образом, программа расширяется, но не изменяется,
// что соответствует принципу открытости/закрытости.