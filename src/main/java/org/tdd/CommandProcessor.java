package org.tdd;

import java.util.ArrayList;
import java.util.Arrays;

public class CommandProcessor {
    private final MarsRover marsRover;

    public CommandProcessor(MarsRover marsRover){
        this.marsRover = marsRover;
    }

     public void processCommands(String command) {
        Arrays.stream(command.split(""))
                .forEach(cmd -> {
                    marsRover.execCommand(cmd);
                    marsRover.getStatus();
                });
     }

}
