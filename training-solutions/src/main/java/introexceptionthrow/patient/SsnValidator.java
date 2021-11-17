package introexceptionthrow.patient;

import controliteration.day.Day;

public class SsnValidator {

    private int assist = 0;

    public boolean isValidSsn(String ssn) {
        boolean valid=true;
        if (!(ssn.length() == 9)) {
            valid = false;
            throw new IllegalArgumentException("A TAJ számnak kilenc jegyűnek kell lenni!");
        }

        for (int i = 1; i < ssn.length(); i = i + 2) {

            assist += (Integer.parseInt(ssn.substring(i, i+1))) * 7;
        }

        for (int i = 0; i < ssn.length()-1; i = i + 2) {

            assist += (Integer.parseInt(ssn.substring(i, i+1))) * 3;
        }

        if (!(assist % 10 == Integer.parseInt(ssn.substring(8)))) {
            valid = false;
            throw new IllegalArgumentException("Nem valós a TAJ szám!");
        }
        return valid;
    }
}
