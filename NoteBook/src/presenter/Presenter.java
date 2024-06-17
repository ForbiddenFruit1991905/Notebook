package sixth.Homework.src.presenter;

import sixth.Homework.src.model.Note;
import sixth.Homework.src.model.NoteBookService;
import sixth.Homework.src.view.View;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Presenter {
    private NoteBookService noteBookService;
    private View view;

    public Presenter(View view) {
        this.view = view;
        noteBookService = new NoteBookService();
    }

    //    Добавить новую запись
    public String addNote(String firstName, String lastName, String note, String heading, LocalDate date, LocalTime time, LocalDateTime timeNote) {
        noteBookService.addNote(firstName, lastName, note, heading, date, time, timeNote);
        return note;
    }

    //    Поиск записи по ID
    public Note findById(int count_id) {
        return (Note) noteBookService.findById(count_id);
    }

    //    Удаление записи
    public void deleteNote(int count_id) {
        noteBookService.deleteNote(count_id);
    }

    //    Список всех записей
    public void getNotebook() {
        String answer = noteBookService.getNotebook();
        view.printAnswer(answer);
    }

    //    Сортировка по датам посещения/события
    public void getComparatorByDateTime() {
        noteBookService.getComparatorByDateTime();
    }

}
