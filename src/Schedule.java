import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Schedule {
    List<Event> events = new ArrayList<>();
    public void addEvent(Event event){
        events.add(event);
    }
    public List<Event> getEventsByDate(LocalDate date) {
        List<Event> eventsByDate = new ArrayList<>();
        for (Event event : events) {
            if (event.localDateTime.toLocalDate().equals(date)) {
                eventsByDate.add(event);
            }
        }
        return eventsByDate;
    }

    public void removePastEvents() {
        events.removeIf(event -> event.localDateTime.isBefore(LocalDateTime.now()));
    }
    public void allEvent(){
        System.out.println(events);
    }
}
