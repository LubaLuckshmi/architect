package seminar4.onlineTicket;
/**
 * Интерфейс, определяющий действия пользователя.
 */
interface UserActions {
        /*
Компонент: UserActions
Версия: 1.0.0
Описание: Этот компонент определяет контракты для действий пользователя.
Изменения:
- 1.0.0: Первая версия.
- 1.1.0: Добавлена поддержка новой функциональности.*/
        boolean authorize(String username, String password);
        boolean selectRoute(String routeId, DateTime time);
        boolean checkTicketAvailability();
        boolean checkFunds();

        boolean reserveTicket();

        boolean deductFunds();

        boolean confirmPurchase();

        void updateTicketAvailability();

        boolean cancelReservation();
}
