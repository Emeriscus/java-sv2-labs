package methodpass;

import methodpass.window.Window;
import methodpass.window.WindowOperation;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WindowOperationTest {

    WindowOperation windowOperation = new WindowOperation();

    @Test
    void riseSizeTest() {

        List<Window> windows = Arrays.asList(
                new Window("nappali", 125, 120),
                new Window("háló", 150, 130),
                new Window("konyha", 160, 110),
                new Window("előszoba", 180, 150)
        );

        windowOperation.riseSize(windows, 5);

        assertEquals(125, windows.get(0).getHeight());
        assertEquals(135, windows.get(1).getHeight());
        assertEquals(115, windows.get(2).getHeight());
        assertEquals(155, windows.get(3).getHeight());
    }
}