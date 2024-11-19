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

}