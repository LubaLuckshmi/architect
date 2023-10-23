package seminar5.calculator;
// Горизонтальные уровни архитектуры калькулятора

import seminar5.calculator.calculatorMVC.model.sumOperation.SumOperation;

// Уровень ввода и вывода
class InputOutputLayer {
    String getInput() {
// Чтение ввода пользователя
        return null;
    }

    void displayOutput(String result) {
// Вывод результата на экран
    }
}

// Уровень вычислений
class CalculationLayer {
    public double add(double a, double b) {
// Сложение
        SumOperation sumOperation = new SumOperation(a, b);
        return sumOperation.sum();
    }

    double subtract(double a, double b) {
// Вычитание
        return a-b;
    }

    double multiply(double a, double b) {
// Умножение
        return a*b;
    }

    double divide(double a, double b) {
// Деление
        return a/b;
    }
}

// Уровень управления
class ControlLayer {
    InputOutputLayer ioLayer;
    CalculationLayer calcLayer;

    ControlLayer() {
        ioLayer = new InputOutputLayer();
        calcLayer = new CalculationLayer();
    }

    void runCalculator() {
        String input = ioLayer.getInput();
// Анализ ввода и управление вычислениями
// Вывод результата с использованием ioLayer
    }
}