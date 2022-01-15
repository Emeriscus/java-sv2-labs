package collectionsqueue;

public class ToDo {

    private String description;
    private boolean isUrgen;

    public ToDo(String description, boolean isUrgen) {
        this.description = description;
        this.isUrgen = isUrgen;
    }

    public String getDescription() {
        return description;
    }

    public boolean isUrgen() {
        return isUrgen;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "description='" + description + '\'' +
                ", isUrgen=" + isUrgen +
                '}';
    }
}
