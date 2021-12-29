package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {

    @Test
    void seatHeaterOffTest() {

        SeatHeaterState seatHeaterState = SeatHeaterState.OFF;

        assertEquals(SeatHeaterState.THIRD_DEGREE, seatHeaterState.next());
    }

    @Test
    void seatHeaterThirdDegreeTest() {

        SeatHeaterState seatHeaterState = SeatHeaterState.THIRD_DEGREE;

        assertEquals(SeatHeaterState.SECOND_DEGREE, seatHeaterState.next());
    }

    @Test
    void seatHeaterOffSecondDegreeTest() {

        SeatHeaterState seatHeaterState = SeatHeaterState.SECOND_DEGREE;

        assertEquals(SeatHeaterState.FIRST_DEGREE, seatHeaterState.next());
    }

    @Test
    void seatHeaterOffFirstDegreeTest() {

        SeatHeaterState seatHeaterState = SeatHeaterState.FIRST_DEGREE;

        assertEquals(SeatHeaterState.OFF, seatHeaterState.next());
    }


}