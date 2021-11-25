package algorithmstransformation.family;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    Family family;

    @BeforeEach
    void init() {
        family = new Family();

        family.addFamilyMember(new FamilyMember("Kiss István", 30));
        family.addFamilyMember(new FamilyMember("Kiss József", 35));
        family.addFamilyMember(new FamilyMember("Gál István", 25));
        family.addFamilyMember(new FamilyMember("Nagy István", 22));
        family.addFamilyMember(new FamilyMember("Kiss Géza", 32));
    }

    @Test
    void getAgesOfFamilyMembersWithNameGivenTest() {

        List<Integer> expected = Arrays.asList(30, 25, 22);
        List<Integer> result = family.getAgesOfFamilyMembersWithNameGiven("István");

        assertEquals(expected, result);
        assertEquals(3, result.size());
        assertTrue(result.contains(30));
        assertFalse(result.contains(35));
    }
}