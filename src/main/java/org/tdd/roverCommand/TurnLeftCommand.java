package org.tdd.roverCommand;

import org.tdd.MarsRover;

public class TurnLeftCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.getOrientation().turnLeft();
    }
}
