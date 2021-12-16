package defaultconstructor.date;

public class SimpleDateFormatter {

    private CountryCode countryCode;
    private SimpleDate simpleDate;

    public SimpleDateFormatter() {
        countryCode = CountryCode.HU;
    }


    public String formatDateString(SimpleDate simpleDate) {
        return simpleDate.getYear() + "-" + simpleDate.getMonth() + "-" + simpleDate.getDay();
    }


    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        if (countryCode.equals(CountryCode.US)) {
            return simpleDate.getMonth() + "-" + simpleDate.getDay() + "-" + simpleDate.getYear();
        }
        if (countryCode.equals(CountryCode.EN)) {
            return simpleDate.getDay() + "-" + simpleDate.getMonth() + "-" + simpleDate.getYear();
        }
        return formatDateString(simpleDate);
    }
}
