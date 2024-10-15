package org.example;

import org.example.Commands.DelCommand;
import org.example.Commands.SaveCommand;
import org.example.Commands.SelectCommand;
import org.example.Commands.UpdCommand;

public class Main {
    public static void main(String[] args) {
        User client=new User(
                new SaveCommand(),
                new SelectCommand(),
                new DelCommand(),
                new UpdCommand());


        client.save();
        client.delete();
        client.select();
        client.update();

    }
}