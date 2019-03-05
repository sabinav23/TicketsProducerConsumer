import java.util.Random;

public class FestivalAttendeeThread implements Runnable {

    private FestivalGate festivalGate;

    public FestivalAttendeeThread(FestivalGate festivalGate){
        this.festivalGate = festivalGate;
    }

    @Override
    public void run() {
        try {
            while(true){
                Thread.sleep(100);
                this.festivalGate.addTicket(TicketType.values()[new Random().nextInt(5)]);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
