package stringbasic.university;

public class Student {

    private Person person;
    private String NeptunCode;
    private String studentIdentifier;
    private int entryCard;

    public Student(Person person, String neptunCode, String studentIdentifier) {
        this.person = person;
        NeptunCode = neptunCode;
        this.studentIdentifier = studentIdentifier;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptunCode() {
        return NeptunCode;
    }

    public void setNeptunCode(String neptunCode) {
        NeptunCode = neptunCode;
    }

    public String getStudentIdentifier() {
        return studentIdentifier;
    }

    public void setStudentIdentifier(String studentIdentifier) {
        this.studentIdentifier = studentIdentifier;
    }

    public int getEntryCard() {
        return entryCard;
    }

    public void setEntryCard(int entryCard) {
        this.entryCard = entryCard;
    }
}
