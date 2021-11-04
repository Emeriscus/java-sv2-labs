package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabelsTest {

    @Test
    void labelsTest() {

        Labels labels = new Labels();
        int[][] k = labels.getTableOfNumbers(3);

        assertEquals(6, k[2][2]);
        assertEquals(8, labels.getTableOfNumbers(4)[3][3]);

    }


}
