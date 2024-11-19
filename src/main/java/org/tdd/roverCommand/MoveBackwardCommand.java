package org.tdd.roverCommand;

import org.tdd.MarsRover;

public class MoveBackwardCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.getLocation().moveBackward();
    }
}
