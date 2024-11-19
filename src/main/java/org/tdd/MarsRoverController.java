package org.tdd;

public class MarsRoverController {
    public static void main(String[] args) {
        MarsRover marsRover = new MarsRover();
        CommandProcessor commandProcessor = new CommandProcessor(marsRover);
        commandProcessor.processCommands("FFF");
        System.out.println(marsRover.getStatus());
    }
}
