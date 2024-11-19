package org.tdd;

import java.util.ArrayList;
import java.util.Arrays;

public class CommandProcessor {
    private final MarsRover marsRover;

    public CommandProcessor(MarsRover marsRover){
        this.marsRover = marsRover;
    }

     public void processCommands(String command) {
        // split the command string into individual commands and stream them into running the execCommand method
        Arrays.stream(command.split("")).forEach(marsRover::execCommand);
     }

}
