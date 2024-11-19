import org.example.MarsRover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MarsRoverTest {

    @Test
    public void should_init_marsRover(){
        MarsRover rover = new MarsRover();
        assertNotNull(rover);
    }

    @Test
    public void should_face_west_when_orient_north_and_turn_left(){
        // Given
        MarsRover rover = new MarsRover();

        // When
        String response = rover.execCommand("L");
        String report = rover.getStatus();

        // Then
        assertEquals("0:0:W", report);
    }

    @Test
    public void should_face_east_when_orient_north_and_turn_right(){
        // Given
        MarsRover rover = new MarsRover();

        // When
        String response = rover.execCommand("R");
        String report = rover.getStatus();

        // Then
        assertEquals("0:0:E", report);
    }

    @Test
    public void should_face_north_when_orient_east_and_turn_left(){
        // Given
        MarsRover rover = new MarsRover();
        rover.execCommand("R");

        // When
        String response = rover.execCommand("L");
        String report = rover.getStatus();

        // Then
        assertEquals("0:0:N", report);
    }


    @Test
    public void should_face_south_when_orient_east_and_turn_right(){
        // Given
        MarsRover rover = new MarsRover();
        rover.execCommand("R");

        // When
        String response = rover.execCommand("R");
        String report = rover.getStatus();

        // Then
        assertEquals("0:0:S", report);
    }

    @Test
    public void should_face_east_when_orient_south_and_turn_left(){
        // Given
        MarsRover rover = new MarsRover();
        rover.execCommand("R");
        rover.execCommand("R");

        // When
        String response = rover.execCommand("L");
        String report = rover.getStatus();

        // Then
        assertEquals("0:0:E", report);
    }

    @Test
    public void should_face_west_when_orient_south_and_turn_right(){
        // Given
        MarsRover rover = new MarsRover();
        rover.execCommand("R");
        rover.execCommand("R");

        // When
        String response = rover.execCommand("R");
        String report = rover.getStatus();

        // Then
        assertEquals("0:0:W", report);
    }

    @Test
    public void should_face_south_when_orient_west_and_turn_left(){
        // Given
        MarsRover rover = new MarsRover();
        rover.execCommand("L");

        // When
        String response = rover.execCommand("L");
        String report = rover.getStatus();

        // Then
        assertEquals("0:0:S", report);
    }

    @Test
    public void should_face_north_when_orient_west_and_turn_right(){
        // Given
        MarsRover rover = new MarsRover();
        rover.execCommand("L");

        // When
        String response = rover.execCommand("R");
        String report = rover.getStatus();

        // Then
        assertEquals("0:0:N", report);
    }

    @Test
    public void should_move_forward_to_0_1_when_orient_north_and_move_forward_given_0_0(){
        // Given
        MarsRover rover = new MarsRover();

        // When
        String response = rover.execCommand("M");
        String report = rover.getStatus();

        // Then
        assertEquals("0:1:N", report);
    }

    @Test
    public void should_move_forward_to_1_0_when_orient_east_and_move_forward_given_0_0(){
        // Given
        MarsRover rover = new MarsRover();
        rover.execCommand("R");

        // When
        String response = rover.execCommand("M");
        String report = rover.getStatus();

        // Then
        assertEquals("1:0:E", report);
    }
}