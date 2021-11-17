package introexceptionthrow;


public class Validation {

    public void validateName(String name) {

        if (name == null || "".equals(name)) {
            throw new IllegalArgumentException("A név nem megfelelő: null, vagy üres");
        }
    }

    public void validateAge(String ageString) {

        if ("".equals(ageString)) {
            throw new IllegalArgumentException("Az életkort meg kell adni!");
        }

        for (char actual : ageString.toCharArray()) {
            if (!Character.isDigit(actual)) {
                throw new IllegalArgumentException("Az életkor csak számokat tartalmazhat!" + ageString);
            }
        }

        if (Integer.parseInt(ageString) > 120 || Integer.parseInt(ageString) < 0) {
            throw new IllegalArgumentException("Az életkor nem megfelelő" + ageString);
        }
    }
}
