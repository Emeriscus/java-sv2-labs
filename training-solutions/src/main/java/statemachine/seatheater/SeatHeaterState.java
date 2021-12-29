package statemachine.seatheater;

public enum SeatHeaterState {

    OFF {
        SeatHeaterState next() {
            return SeatHeaterState.THIRD_DEGREE;
        }
    },

    THIRD_DEGREE {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.SECOND_DEGREE;
        }
    },

    SECOND_DEGREE {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.FIRST_DEGREE;
        }
    },

    FIRST_DEGREE {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.OFF;
        }
    };

    abstract SeatHeaterState next();
}
