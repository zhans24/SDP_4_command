package org.example.Commands;

import org.example.Command;
import org.example.Database;

public class UpdCommand implements Command {
    @Override
    public void execute() {
        new Database().updateQuery();
    }
}
