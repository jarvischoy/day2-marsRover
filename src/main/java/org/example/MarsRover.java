package org.example;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    public MarsRover() {
        this.x = 0;
        this.y = 0;
        this.direction = "N";
    }

    public String execCommand(String command) {
        switch (command) {
            case "L":
                turnLeft();
                break;
            default:
                break;
        }
        return "0:0:" + direction;
    }

    public void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            default:
                break;
        }
    }

    public String getStatus() {
        return String.format("%d:%d:%s", x, y, direction);
    }

}