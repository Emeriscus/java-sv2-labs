package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {

    @Test
    void nextTest() {

        assertEquals(TypeWriterState.LOWERCASE, TypeWriterState.UPPERCASE.nextLine());
        assertEquals(TypeWriterState.UPPERCASE, TypeWriterState.LOWERCASE.nextLine());
    }
}