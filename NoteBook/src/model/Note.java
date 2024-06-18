package sixth.Homework.src.model;

import sixth.Homework.src.model.comparator.NotesComparator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Note implements NotesComparator<Note> {
    private int id;
    private String firstName;
    private String lastName;
    private String note;
    private String heading;
    private LocalDate date;
    private LocalTime time;
    private LocalDateTime timeNote;

    public Note(int id, String firstName, String lastName, String note, String heading, LocalDate date, LocalTime time, LocalDateTime timeNote) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.note = note;
        this.heading = heading;
        this.date = date;
        this.time = time;
        this.timeNote = timeNote;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNote() {
        return note;
    }

    public String getHeading() {
        return heading;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public LocalDateTime getTimeNote() {
        return timeNote;
    }

    @Override
    public Note addNote(Note note) {
        return note;
    }

    @Override
    public Note findById(int count_id) {
        return null;
    }

    @Override
    public Note removeNote(int count_id) {
        return null;
    }

    @Override
    public List<Note> getNotebook() {
        return List.of();
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo(){

        String msg =
                "**********************************************************" +
                "\n" +
                "id: " +
                id +
                "\n" +
                "имя: " +
                firstName +
                "\n" +
                "фамилия: " +
                lastName +
                "\n" +
                "Дата и время события: " +
                date +
                " " +
                time +
                "\n" +
                "Событие: " +
                heading +
                "\n" +
                "Заметка: " +
                note +
                "\n" +
                "Дата и время записи: " +
                timeNote +
                "\n" +
                "**********************************************************";
        
        return msg;
    }


    @Override
    public int compareTo(Note o) {
        return 0;
    }
}
