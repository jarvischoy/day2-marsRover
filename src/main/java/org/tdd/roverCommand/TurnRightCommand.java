package org.tdd.roverCommand;

import org.tdd.MarsRover;

public class TurnRightCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.getOrientation().turnRight();
    }
}
