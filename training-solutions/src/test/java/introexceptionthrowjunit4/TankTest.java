package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class TankTest {

    Tank tank = new Tank();

    @Test
    public void tankTest() {
        tank.modifyAngle(80);
        assertEquals(80, tank.getAngle());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tankWithBadAngleTest() {
        tank.modifyAngle(81);
    }

    @Rule
    public ExpectedException e = ExpectedException.none();

    @Test
    public void tankWithAnotherBadAngleTest() {

        e.expect(IllegalArgumentException.class);
        e.expectMessage("A tank csöve nem tud ennyire elfordulni!");
        tank.modifyAngle(81);
    }

    @Test
    public void tankWithBrandNewAnotherBadAngleTest() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(-81));

        assertEquals("A tank csöve nem tud ennyire elfordulni!", e.getMessage());

    }
}