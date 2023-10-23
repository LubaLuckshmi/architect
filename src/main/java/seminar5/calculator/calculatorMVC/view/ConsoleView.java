package seminar5.calculator.calculatorMVC.view;

import seminar5.calculator.calculatorMVC.model.CalculationLayer;


public class ConsoleView implements IView{

    InputOutputLayer ioLayer;
    CalculationLayer calcLayer;

    public ConsoleView() {
        ioLayer = new InputOutputLayer();
        calcLayer = new CalculationLayer();
    }

    void runCalculator() {
        String input = ioLayer.getInput();
// Анализ ввода и управление вычислениями
// Вывод результата с использованием ioLayer
    }
    @Override
    public void RunCalculator() {

        calcLayer.subtract(Double.parseDouble(ioLayer.getInput()), Double.parseDouble(ioLayer.getInput()));
    }
}
