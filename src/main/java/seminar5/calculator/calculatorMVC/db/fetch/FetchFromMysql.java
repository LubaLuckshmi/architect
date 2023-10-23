package seminar5.calculator.calculatorMVC.db.fetch;

public class FetchFromMysql implements IFetchFromDB {

    @Override
    public String fetchFromDB() {
        return "return from mysql";
    }
}