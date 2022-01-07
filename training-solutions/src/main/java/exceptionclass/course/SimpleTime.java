package exceptionclass.course;

public class SimpleTime {

    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        if (timeFromIntValidator(hour, minute)) {
            this.hour = hour;
            this.minute = minute;
        }
    }

    public SimpleTime(String hoursAndMinutes) {
        if (hoursAndMinutes == null) {
            throw new InvalidTimeException("Time is null");
        }
        if (!timeFromStringValidator(hoursAndMinutes)) {
            throw new InvalidTimeException("Time is not hh:mm");
        } else {
            String[] parts = hoursAndMinutes.split(":");
            if (timeFromIntValidator(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]))) {
                this.hour = Integer.parseInt(parts[0]);
                this.minute = Integer.parseInt(parts[1]);
            }
        }
    }

    private boolean timeFromIntValidator(int hour, int minute) {
        boolean isValidTime = false;
        if (hour < 0 || hour >= 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if (minute < 0 || minute >= 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        } else {
            return true;
        }
    }

    private boolean timeFromStringValidator(String hoursAndMinutes) {
        char[] parts = hoursAndMinutes.toCharArray();
        boolean isValid = true;
        if (hoursAndMinutes.length() != 5
                || !Character.isDigit(parts[0])
                || !Character.isDigit(parts[1])
                || parts[2] != ':'
                || !Character.isDigit(parts[3])
                || !Character.isDigit(parts[4])) {
            isValid = false;
        }
        return isValid;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        String hourToString;
        String minuteToString;
        if (Integer.toString(hour).length() == 1) {
            hourToString = "0" + hour;
        } else {
            hourToString = Integer.toString(hour);
        }
        if (Integer.toString(minute).length() == 1) {
            minuteToString = "0" + minute;
        } else {
            minuteToString = Integer.toString(minute);
        }
        return hourToString + ":" + minuteToString;

//        return String.format("%02d:%02d", this.hour, this.minute);      //mindez egy sorban... :)
    }
}
