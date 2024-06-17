package sixth.Homework.src.view.commands;

import sixth.Homework.src.view.ConsoleUI;

public class GetComparatorByDateTime extends Commands{
    public GetComparatorByDateTime(ConsoleUI consoleUI) {
        super("сортировка по датам событий", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().getComparatorByDateTime();
    }
}
