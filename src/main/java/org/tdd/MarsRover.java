package org.tdd;

import org.tdd.location.Location;
import org.tdd.orientation.Direction;
import org.tdd.orientation.Orientation;
import org.tdd.roverCommand.Command;
import org.tdd.roverCommand.MoveForwardCommand;
import org.tdd.roverCommand.TurnLeftCommand;
import org.tdd.roverCommand.TurnRightCommand;

import java.util.HashMap;
import java.util.Map;

public class MarsRover {
    private final Location location;
    private final Direction orientation;
    private final Map<String, Command> commandMap;

    public MarsRover() {
        this.orientation = new Orientation();
        this.location = new Location(orientation);
        this.commandMap = new HashMap<>();
        commandMap.put("M", new MoveForwardCommand());
        commandMap.put("L", new TurnLeftCommand());
        commandMap.put("R", new TurnRightCommand());
    }

    public String execCommand(String command) {
        Command cmd = commandMap.get(command);
        if (cmd != null) {
            cmd.execute(this);
        }
        return getStatus();
    }

    public Location getLocation() {
        return location;
    }

    public Direction getOrientation() {
        return orientation;
    }

    public String getStatus() {
        return String.format("%d:%d:%s", location.getX(), location.getY(), orientation.getDirection());
    }
}