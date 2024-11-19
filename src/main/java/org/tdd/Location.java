package org.tdd;

public class Location {
    private int x;
    private int y;
    private final Direction orientation;

    public Location(Direction orientation) {
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
            default:
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
            default:
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
