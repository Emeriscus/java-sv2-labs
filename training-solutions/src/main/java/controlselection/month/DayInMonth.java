package controlselection.month;

public class DayInMonth {

    private int numberOfDays;
    public int dayInMonth(int year, String month) {
        month = month.toLowerCase();
        switch (month) {
            case ("január") :
            case ("március") :
            case ("május") :
            case ("július") :
            case ("augusztus") :
            case ("október") :
            case ("december") :
                numberOfDays = 31;
                break;
            case ("április") :
            case ("június") :
            case ("szeptember") :
            case ("novemberr") :
                numberOfDays = 30;
                break;
            case ("február") :
                if (((year % 4 ==0 && year % 100 !=0)) || (year % 400 == 0)) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
            }
                break;
            default:
                return 0;
        }
        return numberOfDays;
    }
}
