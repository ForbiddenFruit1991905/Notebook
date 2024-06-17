package sixth.Homework.src.view.commands;

import sixth.Homework.src.view.ConsoleUI;

public class GetNotebook extends Commands{

    public GetNotebook(ConsoleUI consoleUI) {
        super("показать весь список", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().getNotebook();
    }
}
