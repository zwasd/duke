package duke.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event extends Task {

    private LocalDateTime start;
    private LocalDateTime end;

    public Event(boolean isDone, String description, LocalDateTime start, LocalDateTime end) {
        super(isDone, description);
        this.start = start;
        this.end = end;
    }

    public String toSaveFormat() {
        return String.format("E | %s | %s %s", super.toSaveFormat(), start, end);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy, HH:mm");
        return String.format("[E]%s (time: %s to %s)", super.toString(),
                start.format(formatter), end.format(formatter));
    }
}