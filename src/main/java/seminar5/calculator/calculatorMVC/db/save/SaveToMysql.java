package seminar5.calculator.calculatorMVC.db.save;

public class SaveToMysql implements ISaveToDB {

    @Override
    public void saveToDB(String info) {
        System.out.println("Save to mysql: " + info);
    }
}