import java.util.ArrayList;
import java.util.List;

public class FestivalGate {

    private List<TicketType> ticketTypes ;

    public FestivalGate(){
        this.ticketTypes = new ArrayList<>();
    }

    public void addTicket(TicketType ticketType){
        this.ticketTypes.add(ticketType);
    }

    public List<TicketType> getTicketTypes(){
        return this.ticketTypes;
    }

}
