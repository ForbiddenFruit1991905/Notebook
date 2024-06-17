package sixth.Homework.src.view.commands;

import sixth.Homework.src.view.ConsoleUI;

public class AddNote extends Commands{

    public AddNote(ConsoleUI consoleUI) {
        super("добавить новую заметку", consoleUI);
    }
    
    @Override
    public void execute() {
        getConsoleUI().addNote();
    }
}

