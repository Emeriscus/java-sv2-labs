package searching;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LostAndFoundOffice {

    private List<LostProperty> lostProperties = new ArrayList<>();

    public List<LostProperty> getLostProperties() {
        return lostProperties;
    }

    public void addProperty(LostProperty lostProperty) {
        lostProperties.add(lostProperty);
    }

    public LostProperty findLostProperty(LostProperty lostProperty) {

        int result = Collections.binarySearch(lostProperties, lostProperty);
        if (result < 0) {
            throw new IllegalArgumentException("Property not found.");
        } else {
            return lostProperties.get(result);
        }
    }
}
