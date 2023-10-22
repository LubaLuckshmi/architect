package seminar4.onlineTicket;

public class BusTicket extends Ticket{
    @Override
    public boolean reserveTicket() {
        return false;
    }

    @Override
    public boolean confirmPurchase() {
        return false;
    }

    @Override
    public void updateTicketAvailability() {

    }
}
