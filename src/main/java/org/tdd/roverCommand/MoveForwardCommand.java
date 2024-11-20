package org.tdd.roverCommand;

import org.tdd.MarsRover;

public class MoveForwardCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.getCoords().moveForward();
    }
}
