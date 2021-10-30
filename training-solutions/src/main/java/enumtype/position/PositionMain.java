package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {

        System.out.println(Position.valueOf("OPERATOR"));
        System.out.println(Position.SALES_MANAGER.name());
        System.out.println(Position.SALES_MANAGER.toString());
        System.out.println(Position.MARKETING_MANAGER.getBenefit());
        System.out.println(Position.SHIFT_LEADER.getSalary());

        System.out.println(Position.values()[0]);

        System.out.println();
        for (Position i : Position.values()) {
            System.out.print(i + ", ");
        }

        System.out.println();
        for (Position i : Position.values()) {
            System.out.print(i.getSalary() + ", ");
        }

        System.out.println();
        for (Position i : Position.values()) {
            System.out.print(i.getBenefit() + ", ");
        }

        System.out.println();
        for (int i = 0; i < Position.values().length; i++) {
                System.out.println(Position.values()[i]  + " - " +
                        "fizetés: " + Position.values()[i].getSalary() + " Ft, " +
                        "juttatások: " + Position.values()[i].getBenefit() + "; ");
        }
    }
}
