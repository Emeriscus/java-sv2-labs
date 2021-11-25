package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyMemberTest {

    @Test
    void createFamilyMemberTest() {
        FamilyMember familyMember = new FamilyMember("Kiss István", 32);

        assertEquals(32, familyMember.getAge());
        assertEquals("Kiss István", familyMember.getName());
    }
}