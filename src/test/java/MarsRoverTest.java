import org.junit.jupiter.api.Test;
import org.tdd.CommandProcessor;
import org.tdd.MarsRover;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    public void should_init_marsRover(){
        MarsRover rover = new MarsRover();
        assertNotNull(rover);
    }

    @Test
    public void should_return_0_0_N_when_init_marsRover(){
        MarsRover rover = new MarsRover();
        String report = rover.getStatus();
        assertEquals("0:0:N", report);
    }

    @Test
    public void should_face_west_when_orient_north_and_turn_left(){
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.execCommand("L");
        String report = rover.getStatus();

        // Then
        assertEquals("0:0:W", report);
    }

    @Test
    public void should_face_east_when_orient_north_and_turn_right(){
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.execCommand("R");
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
        rover.execCommand("L");
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
        rover.execCommand("R");
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
        rover.execCommand("L");
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
        rover.execCommand("R");
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
        rover.execCommand("L");
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
        rover.execCommand("R");
        String report = rover.getStatus();

        // Then
        assertEquals("0:0:N", report);
    }

    @Test
    public void should_return_0_1_N_when_move_forward_given_0_0_N(){
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.execCommand("F");
        String report = rover.getStatus();

        // Then
        assertEquals("0:1:N", report);
    }

    @Test
    public void should_return_1_0_E_when_move_forward_given_0_0_E(){
        // Given
        MarsRover rover = new MarsRover();
        rover.execCommand("R");

        // When
        rover.execCommand("F");
        String report = rover.getStatus();

        // Then
        assertEquals("1:0:E", report);
    }

    @Test
    public void should_return_0_minus1_S_when_move_forward_given_0_0_S(){
        // Given
        MarsRover rover = new MarsRover();
        rover.execCommand("R");
        rover.execCommand("R");

        // When
        rover.execCommand("F");
        String report = rover.getStatus();

        // Then
        assertEquals("0:-1:S", report);
    }

    @Test
    public void should_return_minus1_0_W_when_move_forward_given_0_0_W(){
        // Given
        MarsRover rover = new MarsRover();
        rover.execCommand("R");
        rover.execCommand("R");
        rover.execCommand("R");

        // When
        rover.execCommand("F");
        String report = rover.getStatus();

        // Then
        assertEquals("-1:0:W", report);
    }

    @Test
    public void should_return_0_minus1_N_when_move_backward_given_0_0_N(){
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.execCommand("B");
        String report = rover.getStatus();

        // Then
        assertEquals("0:-1:N", report);
    }

    @Test
    public void should_return_minus1_0_E_when_move_backward_given_0_0_E(){
        // Given
        MarsRover rover = new MarsRover();
        rover.execCommand("R");

        // When
        rover.execCommand("B");
        String report = rover.getStatus();

        // Then
        assertEquals("-1:0:E", report);
    }

    @Test
    public void should_return_0_1_S_when_move_backward_given_0_0_S(){
        // Given
        MarsRover rover = new MarsRover();
        rover.execCommand("R");
        rover.execCommand("R");

        // When
        rover.execCommand("B");
        String report = rover.getStatus();

        // Then
        assertEquals("0:1:S", report);
    }

    @Test
    public void should_return_1_0_W_when_move_backward_given_0_0_W(){
        // Given
        MarsRover rover = new MarsRover();
        rover.execCommand("R");
        rover.execCommand("R");
        rover.execCommand("R");

        // When
        rover.execCommand("B");
        String report = rover.getStatus();

        // Then
        assertEquals("1:0:W", report);
    }

    @Test
    public void shuold_return_0_1_N_when_move_forward_given_0_0_N_and_command_FFF(){
        // Given
        MarsRover rover = new MarsRover();
        CommandProcessor commandProcessor = new CommandProcessor(rover);

        // When
        commandProcessor.processCommands("FFB");
        String report = rover.getStatus();

        // Then
        assertEquals("0:1:N", report);
    }

}