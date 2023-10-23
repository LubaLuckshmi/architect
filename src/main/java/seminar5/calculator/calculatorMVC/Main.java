package seminar5.calculator.calculatorMVC;

import seminar5.calculator.calculatorMVC.view.ConsoleView;
import seminar5.calculator.calculatorMVC.view.IView;

public class Main {
    public static void main(String[] args) {
        IView view = new ConsoleView();
        view.RunCalculator();
    }

}
