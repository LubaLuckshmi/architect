package seminar5.calculator.calculatorMVC.model;

import seminar5.calculator.calculatorMVC.model.substractOperation.SubstractOperation;
import seminar5.calculator.calculatorMVC.model.sumOperation.SumOperation;

public class CalculationLayer {
   public double add(double a, double b) {
// Сложение
        SumOperation sumOperation = new SumOperation(a, b);
        return sumOperation.sum();
    }

    public double subtract(double a, double b) {
// Вычитание
        SubstractOperation substractOperation = new SubstractOperation(a,b);
        return substractOperation.substract();
    }

    public double multiply(double a, double b) {
// Умножение
        return a*b;
    }

    public double divide(double a, double b) {
// Деление
        return a/b;
    }
}
