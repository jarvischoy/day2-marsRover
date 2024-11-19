package org.tdd.orientation;

public class Orientation implements Direction {
    private String direction;

    public Orientation() {
        this.direction = "N";
    }

    @Override
    public void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
        }
    }

    @Override
    public void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "W":
                direction = "S";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
                break;
        }
    }

    @Override
    public String getDirection() {
        return direction;
    }
}
