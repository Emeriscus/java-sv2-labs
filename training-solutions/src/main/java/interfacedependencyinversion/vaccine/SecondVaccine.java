package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        youngFirst(registrated);
        eldersSecond(registrated);
    }


    private void youngFirst(List<Person> registrated) {
        for (Person actual : registrated) {
            if (actual.getAge() <= 65 && actual.getChronic() == ChronicDisease.NO && actual.getPregnant() == Pregnancy.NO) {
                vaccinationList.add(actual);
            }
        }
    }

    private void eldersSecond(List<Person> registrated) {
        for (Person actual : registrated) {
            if (actual.getAge() > 65 && actual.getChronic() == ChronicDisease.NO && actual.getPregnant() == Pregnancy.NO) {
                vaccinationList.add(actual);
            }
        }
    }
}
