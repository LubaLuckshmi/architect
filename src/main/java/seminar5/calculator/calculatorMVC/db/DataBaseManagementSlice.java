package seminar5.calculator.calculatorMVC.db;
class DatabaseManagementSlice {
    void saveData(String data) {
// Реализация сохранения данных в базу данных
        System.out.println("Сохранено в базе данных: " + data);
    }

    String fetchData() {
// Реализация извлечения данных из базы данных
        return "Данные из базы данных";
    }
}