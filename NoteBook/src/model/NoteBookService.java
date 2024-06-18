package sixth.Homework.src.model;

import sixth.Homework.src.model.comparator.ComparatorByDateTime;
import sixth.Homework.src.model.comparator.NotesComparator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class NoteBookService<T extends NotesComparator<T>> {

    private List<T> notebook;
    private NoteBuilder noteBuilder;

    public NoteBookService() {
        this.notebook = new ArrayList<>();
        this.noteBuilder = new NoteBuilder();
    }

//    Добавить новую запись
     public T addNote (String firstName, String lastName, String note, String heading, LocalDate date, LocalTime time, LocalDateTime timeNote) {
         Note note_txt = noteBuilder.build(firstName, lastName, note, heading, date, time, timeNote);
         notebook.add((T) note_txt);
         return (T) note_txt;
     }


//    Поиск записи по ID
    public T findById(int count_id) {
        for (T note: notebook) {
            if(Objects.equals(note.getId(), count_id)) {
                return note;
            }
        }
        return null;
    }

//    Удаление записи
    public T deleteNote(int count_id) {
        for (T note: notebook) {
            if (Objects.equals(note.getId(), count_id)) {
                return (T) notebook.remove(count_id - 1);
            }
        }
        return null;
    }

//    Список всех записей
    public String getNotebook() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список заметок:\n");
        for (T note: notebook) {
            stringBuilder.append(note);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

//    Сортировка по датам посещения/события
    public void getComparatorByDateTime() {
        notebook.sort(new ComparatorByDateTime<>());
    }


}
