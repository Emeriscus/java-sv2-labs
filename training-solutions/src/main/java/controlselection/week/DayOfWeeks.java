package controlselection.week;

public class DayOfWeeks {

    public String dayOfWeek(String day) {
        day = day.toLowerCase();
        String result;
        switch (day) {
            case "hétfő" :
                result = "hét eleje";
                break;
            case "kedd" :
            case "szerda" :
            case "csürörtök" :
                result = "hét közepe";
                break;
            case "péntek" :
                result = "majdnem hétvége";
                break;
            case "szombat" :
            case "vasárnap" :
                result = "hétvége";
                break;
            default:
                result = "ismeretlen nap";
        }
        return result;
    }
}
