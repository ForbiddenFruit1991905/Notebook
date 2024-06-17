package sixth.Homework.src.model.data.comparator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public interface NotesComparator<T> extends Comparable<T>{
    int getId();
    String getFirstName();
    String getLastName();
    String getHeading();
    LocalDate getDate();
    LocalTime getTime();
    LocalDateTime getTimeNote();
    sixth.Homework.src.model.data.Note addNote(T note);
    T findById(int count_id);
    T removeNote(int count_id);
    List<T> getNotebook();
}
