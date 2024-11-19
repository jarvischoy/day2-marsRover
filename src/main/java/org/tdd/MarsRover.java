package org.tdd;

public class MarsRover {
    private final Location location;
    private final Direction orientation;

    public MarsRover() {
        this.orientation = new Orientation();
        this.location = new Location(orientation);
    }

    public String execCommand(String command) {
        switch (command) {
            case "M":
                location.moveForward();
                break;
            case "L":
                orientation.turnLeft();
                break;
            case "R":
                orientation.turnRight();
                break;
            default:
                break;
        }
        return getStatus();
    }

    public String getStatus() {
        return String.format("%d:%d:%s", location.getX(), location.getY(), orientation.getDirection());
    }

}