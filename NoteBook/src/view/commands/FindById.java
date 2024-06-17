package sixth.Homework.src.view.commands;

import sixth.Homework.src.view.ConsoleUI;

public class FindById extends Commands{

    public FindById(ConsoleUI consoleUI) {
        super("найти заметку по Id", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().findById();
    }
}
