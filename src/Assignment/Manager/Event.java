package Assignment.Manager;

import java.time.LocalDateTime;

public class Event {
    private LocalDateTime deadLine;
    private String name;
    public Event(LocalDateTime deadline, String name) {
        this.deadLine = deadline;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public LocalDateTime getDeadLine() {
        return deadLine;
    }
}