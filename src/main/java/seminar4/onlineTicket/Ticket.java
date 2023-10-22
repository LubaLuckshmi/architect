package seminar4.onlineTicket;

import java.util.Date;

/**
 * Абстрактный класс, представляющий билет.
 */
// Абстрактный класс и наследование
abstract class Ticket implements TicketActions {
    int ticketNumber;
    String routeId;
    Date departureTime;
    double price;

    /**
     * Получить номер билета
     * @return возвращает номер билета
     */
    public int getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Получить время отправления
     * @return возвращает время отправления
     */
    public Date getDepartureTime() {
        return departureTime;
    }

}