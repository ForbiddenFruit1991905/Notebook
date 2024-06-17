package sixth.Homework.src.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class NoteBookBuilder {

    private int count_id = 1;
    private Note note;

    public Note build(String firstName, String lastName, String note, String heading, LocalDate date, LocalTime time, LocalDateTime timeNote){
        return new Note(count_id++, firstName, lastName, note, heading, date, time, timeNote);
    }
}
