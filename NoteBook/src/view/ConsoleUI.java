package sixth.Homework.src.view;

import sixth.Homework.src.model.data.Note;
import sixth.Homework.src.presenter.Presenter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConsoleUI implements View {

    private Scanner scanner;
    private Presenter presenter;
    private boolean flag;
    private Menu menu;
    private Note note;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter((View) this);
        flag = true;
        menu = new Menu(this);
    }

    public void start() {
        while (flag) {
            System.out.println(menu.getMenu());
            String command = scanner.nextLine();
//            menu.execute(command);
            if(checkChoice(command)){
                if (checkChoice(command)){
                    menu.execute(Integer.parseInt(command));
                }
            } else {
                System.out.println("Такой команды нет. \nПопробуйте еще раз ввести данные");
            }
        }
    }
    
    public void addNote() {
        System.out.println("Укажете имя:");
        String firstname = scanner.nextLine();
        System.out.println("Укажете фамилию:");
        String lastname = scanner.nextLine();
        System.out.println("Событие:");
        String heading = scanner.nextLine();
        System.out.println("Заметка:");
        String note_txt = scanner.nextLine();
        System.out.println("Укажите дату гг/мм/дд:");
        LocalDate date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(date.format(dtf));
        System.out.println("Укажите время ч/м:");
        LocalTime time = LocalTime.of(scanner.nextInt(), scanner.nextInt());
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(time.format(tf));
        LocalDateTime ldt = LocalDateTime.now()/*.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))*/;
        System.out.println("Дата и время записи: " + ldt);
        System.out.println(scanner.nextLine());
        System.out.println("Запись внесена ---> " +  "имя: " + firstname + ", фамилия: " + lastname + "\n" + "Событие:" + "\n" + date + ", " + time + "\n" + note_txt + "\n" + "Дата и время записи: " + ldt);
        presenter.addNote(firstname, lastname, heading, note_txt, date, time, ldt);
    }

    public void deleteById() {
        System.out.println("Введите ID для удаления: ");
        String strID = scanner.nextLine();
        int id = Integer.parseInt(strID);
        presenter.deleteNote(id);
        System.out.println("Запись удалена");
        presenter.getNotebook();
    }

    public void findById() {
        System.out.println("Введите ID: ");
        String strID  = scanner.nextLine();
        int idNote = Integer.parseInt(strID);
        System.out.println(presenter.findById(idNote));
    }

    public void getNotebook() {
        presenter.getNotebook();
    }

    public void getComparatorByDateTime() {
        presenter.getComparatorByDateTime();
        presenter.getNotebook();
    }

    public void finish() {
        System.out.println("Exit");
        flag = false;
    }


    public void printAnswer(String answer) {
        System.out.println(answer);
    }

    public boolean checkChoice(String choiceStr) {
        if (choiceStr.matches("[0-9]*")) {
            int choice = Integer.parseInt(choiceStr);
            return (choice >= 1  && choice <= menu.getSize());
        }
        return false;
    }


}
