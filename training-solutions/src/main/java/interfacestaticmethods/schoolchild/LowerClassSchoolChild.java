package interfacestaticmethods.schoolchild;

public class LowerClassSchoolChild implements PrimarySchoolChild {

    private String name;
    private int age;

    public LowerClassSchoolChild(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public LowerClassSchoolChild(String name) {
        this.name = name;
    }

    public LowerClassSchoolChild() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
