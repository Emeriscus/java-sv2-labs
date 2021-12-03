package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {

    @Test
    void modifyTest() {

        ModifiedWord modifiedWord = new ModifiedWord();
        String expected1 = modifiedWord.modify("alma");
        String expected2 = modifiedWord.modify("körte");
        String expected3 = modifiedWord.modify("szilva");

        assertEquals("AxMy", expected1);
        assertEquals("KxRy", expected2);
        assertEquals("SxIy", expected3);
    }
}