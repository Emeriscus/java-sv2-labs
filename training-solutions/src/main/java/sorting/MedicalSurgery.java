package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedicalSurgery {

    List<Patient> todayPatients = new ArrayList<>();

    public MedicalSurgery(List<Patient> todayPatients) {
        this.todayPatients = todayPatients;
    }

    public List<Patient> getTodayPatients() {
        return todayPatients;
    }

    public List<Patient> getPatientsInTimeOrder() {
        List<Patient> ordered = new ArrayList<>(todayPatients);
        Collections.sort(ordered, new PatientComparator());
        return ordered;
    }
}
