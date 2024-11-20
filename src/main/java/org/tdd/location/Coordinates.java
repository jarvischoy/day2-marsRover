package org.tdd.location;

import org.tdd.orientation.Direction;

public class Coordinates {
    private int x;
    private int y;
    private final Direction orientation;

    public Coordinates(Direction orientation) {
        this.x = 0;
        this.y = 0;
        this.orientation = orientation;
    }

    public void moveForward() {
        switch (orientation.getDirection()) {
            case "N":
                y++;
                break;
            case "E":
                x++;
                break;
            case "S":
                y--;
                break;
            case "W":
                x--;
                break;
        }
    }

    public void moveBackward() {
        switch (orientation.getDirection()) {
            case "N":
                y--;
                break;
            case "E":
                x--;
                break;
            case "S":
                y++;
                break;
            case "W":
                x++;
                break;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
