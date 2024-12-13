import java.time.LocalDate;
import java.time.LocalDateTime;

public class Event {
    String name;
    String location;
    LocalDateTime localDateTime;
   // LocalDate localDate;

    public Event(String name, String location, LocalDateTime localDateTime) {
        this.name = name;
        this.location = location;
        this.localDateTime = localDateTime;
    }
    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }


}
