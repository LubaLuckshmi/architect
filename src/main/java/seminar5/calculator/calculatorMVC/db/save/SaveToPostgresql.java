package seminar5.calculator.calculatorMVC.db.save;

public class SaveToPostgresql implements ISaveToDB {

    @Override
    public void saveToDB(String info) {
        System.out.println("Save to postgresql: " + info);
    }
}