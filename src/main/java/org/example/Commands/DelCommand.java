package org.example.Commands;

import org.example.Command;
import org.example.Database;

public class DelCommand implements Command {
    @Override
    public void execute() {
        new Database().deleteQuery();
    }
}
