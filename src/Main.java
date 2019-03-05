
public class Main {

    public static void main(String[] args) {

        FestivalGate gate = new FestivalGate();

        FestivalAttendeeThread festivalAttendeeThread = new FestivalAttendeeThread(gate);
        new Thread(festivalAttendeeThread).start();

        FestivalStatisticsThread festivalStatisticsThread = new FestivalStatisticsThread(gate);
        new Thread(festivalStatisticsThread).start();
    }
}
