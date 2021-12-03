package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {

        School school = new School("school", 30);
        School primarySchool = new PrimarySchool("primary", 20);
        School secondarySchool = new SecondarySchool("secondary", 30);

        System.out.println(school);
        System.out.println(primarySchool);
        System.out.println(secondarySchool);
    }
}
