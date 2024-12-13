import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
       Schedule schedule = new Schedule();
       schedule.addEvent(new Event("Концерт","Клуб 'Малевич'", LocalDateTime.of(2025,01,12,10,00,00)));
       schedule.addEvent(new Event("Виставка","Музей мистецтва",LocalDateTime.of(2024,11,17,15,00,00)));
       schedule.addEvent(new Event("Вистава","Театр",LocalDateTime.of(2024,12,13,15,00,00)));
       schedule.allEvent();
        LocalDate date = LocalDate.of(2024,12,13);
        System.out.println("Заходи на " + date + ":");
        for (Event event : schedule.getEventsByDate(date)) {
            System.out.println(event);
        }

        schedule.removePastEvents();
        System.out.println("Після видалення минулих заходів:");
        schedule.allEvent();
    }
}