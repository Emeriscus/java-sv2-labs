package interfacestaticmethods.schoolchild;

public class UpperClassSchoolChild implements PrimarySchoolChild {

    private String name;
    private int age;

    public UpperClassSchoolChild(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public UpperClassSchoolChild(String name) {
        this.name = name;
    }

    public UpperClassSchoolChild() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
