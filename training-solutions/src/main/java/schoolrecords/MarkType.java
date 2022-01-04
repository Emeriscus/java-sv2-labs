package schoolrecords;

public enum MarkType {
    A(5, "excellent"), B(4, "very good"),
    C(3, "improvement needed"), D(2, "close fail"), F(1, "fail");

    private int grade;
    private String text;

    MarkType(int grade, String text) {
        this.grade = grade;
        this.text = text;
    }

    public int getGrade() {
        return grade;
    }

    public String getText() {
        return text;
    }
}
