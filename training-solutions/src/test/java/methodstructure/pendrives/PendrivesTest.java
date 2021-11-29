package methodstructure.pendrives;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PendrivesTest {

    Pendrives pendrives = new Pendrives();

    static final List<Pendrive> PENDRIVES_LIST = Arrays.asList(
            new Pendrive("Maxell", 16, 2600),
            new Pendrive("Kingstone", 32, 5000),
            new Pendrive("HP", 16, 2000),
            new Pendrive("SanDisk", 32, 5001)
    );

    @Test
    void getBestTest() {
        assertEquals(PENDRIVES_LIST.get(2), pendrives.getBest(PENDRIVES_LIST));
    }

    @Test
    void getCheapestTest() {
        assertEquals(PENDRIVES_LIST.get(2), pendrives.getCheapest(PENDRIVES_LIST));
    }

    @Test
    void risePriceWhereCapacityTest() {
        pendrives.risePriceWhereCapacity(PENDRIVES_LIST, 15, 16);
        assertEquals(2990, PENDRIVES_LIST.get(0).getPrice());
    }
}