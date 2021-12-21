package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        pregnantsFirst(registrated);
        eldersSecond(registrated);
        othersThird(registrated);
    }

    private void pregnantsFirst(List<Person> registrated) {
        for (Person actual : registrated) {
            if (actual.getPregnant() == Pregnancy.YES) {
                this.vaccinationList.add(actual);
            }
        }
    }

    private void eldersSecond(List<Person> registrated) {
        for (Person actual : registrated) {
            if (actual.getAge() > 65 && actual.getPregnant() == Pregnancy.NO) {
                this.vaccinationList.add(actual);
            }
        }
    }

    private void othersThird(List<Person> registrated) {
        for (Person actual : registrated) {
            if (actual.getPregnant() == Pregnancy.NO && actual.getAge() <= 65) {
                this.vaccinationList.add(actual);
            }
        }
    }
}
