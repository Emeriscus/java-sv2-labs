package controlselection.greetings;

public class Greetings {
    private int minutes;

    public String greetings(int hour, int minutes) {
        String greetings;
        minutes = (hour * 60) + minutes;
        if (300 < minutes && minutes <= 540) {
            greetings = "jó reggelt";
        } else {
            if (540 < minutes && minutes <= 1110) {
                greetings = "jó napot";
            } else {
                if (1110 < minutes && minutes <= 1200) {
                    greetings = "jó estét";
                } else {
                    greetings = "jó éjt";
                }
            }
        }
        return greetings;
    }
}
