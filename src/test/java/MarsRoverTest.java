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

}