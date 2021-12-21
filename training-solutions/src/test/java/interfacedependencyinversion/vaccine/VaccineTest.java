package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VaccineTest {

    Vaccine vaccine;
    List<Person> persons;

    @BeforeEach
    void init() {
        persons = new ArrayList<>();
        persons.add(new Person("a", 66, ChronicDisease.YES, Pregnancy.YES));
        persons.add(new Person("b", 68, ChronicDisease.NO, Pregnancy.YES));
        persons.add(new Person("c", 72, ChronicDisease.YES, Pregnancy.NO));
        persons.add(new Person("d", 72, ChronicDisease.NO, Pregnancy.NO));
        persons.add(new Person("e", 65, ChronicDisease.YES, Pregnancy.YES));
        persons.add(new Person("f", 20, ChronicDisease.NO, Pregnancy.YES));
        persons.add(new Person("g", 22, ChronicDisease.NO, Pregnancy.NO));
        persons.add(new Person("h", 25, ChronicDisease.YES, Pregnancy.NO));
    }

    @Test
    void firstVaccineTest() {
        vaccine = new FirstVaccine();

        assertEquals(0, vaccine.getVaccinationList().size());

        vaccine.generateVaccinationList(persons);

        assertEquals(8, vaccine.getVaccinationList().size());
        assertEquals("f", vaccine.getVaccinationList().get(3).getName());
        assertEquals("d", vaccine.getVaccinationList().get(5).getName());
        assertEquals("g", vaccine.getVaccinationList().get(6).getName());
    }

    @Test
    void secondVaccineTest() {
        vaccine = new SecondVaccine();

        assertEquals(0, vaccine.getVaccinationList().size());

        vaccine.generateVaccinationList(persons);

        assertEquals(2, vaccine.getVaccinationList().size());
        assertEquals("g", vaccine.getVaccinationList().get(0).getName());
        assertEquals("d", vaccine.getVaccinationList().get(1).getName());
    }
}