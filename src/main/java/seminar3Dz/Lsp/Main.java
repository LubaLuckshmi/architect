package seminar3Dz.Lsp;

//Программа 3: Принцип подстановки Лисков (Liskov Substitution Principle)

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square(3);
        rectangle.setWidth(4);
        rectangle.setHeight(5);

        System.out.println("Area: " + rectangle.calculateArea());
    }
}


    //В данной программе класс Square наследуется от класса Rectangle.
// Однако, при изменении ширины или высоты Square, оба значения автоматически
// изменяются на одно и то же значение, чтобы сохранить квадратную форму. Это не соответствует
// ожиданиям, потому что setWidth() и setHeight() нарушают ожидаемое поведение в классе Rectangle
// - изменение только соответствующей стороны. Таким образом, нарушается принцип подстановки Лисков.