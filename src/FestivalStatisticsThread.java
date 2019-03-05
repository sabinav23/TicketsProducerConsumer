import java.util.List;
import java.util.stream.Collectors;

public class FestivalStatisticsThread implements Runnable {

    private FestivalGate festivalGate;

    public FestivalStatisticsThread(FestivalGate festivalGate){
        this.festivalGate = festivalGate;
    }

    @Override
    public void run() {
        while (true){
            try {

                List<TicketType> ticketTypes = this.festivalGate.getTicketTypes();

                Thread.sleep(5000);

                if (ticketTypes.size() == 0) {
                    return;
                }

                System.out.println(ticketTypes.size() + " people entered");

                List<TicketType> fullTickets = ticketTypes.stream().filter(ticketType -> ticketType.equals(TicketType.Full)).collect(Collectors.toList());
                List<TicketType> fullVIPTickets = ticketTypes.stream().filter(ticketType -> ticketType.equals(TicketType.Full_VIP)).collect(Collectors.toList());
                List<TicketType> freePassTickets = ticketTypes.stream().filter(ticketType -> ticketType.equals(TicketType.Free_Pass)).collect(Collectors.toList());
                List<TicketType> oneDayTickets = ticketTypes.stream().filter(ticketType -> ticketType.equals(TicketType.One_Day)).collect(Collectors.toList());
                List<TicketType> oneDayVIPTickets = ticketTypes.stream().filter(ticketType -> ticketType.equals(TicketType.One_Day_VIP)).collect(Collectors.toList());

                System.out.println(fullTickets.size() + " have full tickets");
                System.out.println(fullVIPTickets.size() + " have full vip tickets");
                System.out.println(freePassTickets.size() + " have free pass tickets");
                System.out.println(oneDayTickets.size() + " have one day tickets");
                System.out.println(oneDayVIPTickets.size() + " have one day vip tickets");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
