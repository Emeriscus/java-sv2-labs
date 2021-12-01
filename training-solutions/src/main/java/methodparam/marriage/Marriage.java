package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {

    public void getMarried(Woman woman, Man man) {
        womanNameAfterMarriage(woman, man);
        addMarriageToRegisterDates(woman, man);
    }

    private void womanNameAfterMarriage(Woman woman, Man man) {
        woman.setName(getFirstName(woman.getName()) + " " + getSurname(man.getName()));
    }

    private void addMarriageToRegisterDates(Woman woman, Man man) {
        woman.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.now()));
        man.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.now()));
    }

    private String getFirstName(String name) {
        String[] names = name.split(" ");
        String result = names[0];
        return result;
    }

    private String getSurname(String name) {
        String[] names = name.split(" ");
        String result = names[1];
        return result;
    }
}
