package seminar4.onlineTicket;

/**
 * Абстрактный класс, представляющий билет.
 */
// Абстрактный класс и наследование
abstract class Ticket implements TicketActions {
    String routeId;
    DateTime departureTime;
    double price;
}