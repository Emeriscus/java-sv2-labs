package enumtype.position;

public enum Position {

    MARKETING_MANAGER(700_000, "Céges gépkocsi"), SALES_MANAGER(850_000, "céges lakás"),
    SHIFT_LEADER(300_000, "nyári üdülés"), OPERATOR(200_000, "meleg étkezés napi egyszer");

    private final int salary;

    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
