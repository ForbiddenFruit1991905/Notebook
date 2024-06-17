package sixth.Homework.src.view.commands;

import sixth.Homework.src.view.ConsoleUI;

public class Finish extends Commands{

    public Finish(ConsoleUI consoleUI) {
        super("выход из приложения", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().finish();
    }
}
