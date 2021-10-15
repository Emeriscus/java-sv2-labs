package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("Pimi");
        note.setText("kis kút, kerekes kút");
        note.setTopic("mondókák");

        System.out.println(note.getNoteText());
    }
}
