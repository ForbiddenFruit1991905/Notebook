package sixth.Homework.src.view.commands;

import sixth.Homework.src.view.ConsoleUI;

public class DeleteById extends Commands {

    public DeleteById(ConsoleUI consoleUI) {
        super("удалить запись по Id", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().deleteById();
    }
}
