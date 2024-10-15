package org.example.Commands;

import org.example.Command;
import org.example.Database;

public class SaveCommand implements Command {
    @Override
    public void execute() {
        new Database().saveQuery();
    }
}
