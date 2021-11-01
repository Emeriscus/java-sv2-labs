package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {

        Name name1 = new Name("Pocsai", "", "Imre", Title.DR);
        Name name2 = new Name("Sárközi", "The Emperor", "Géza", null);

        System.out.println(name1.concatNameHungarianStyle());
        System.out.println(name2.concatNameHungarianStyle());

        System.out.println();
        System.out.println(name1.concatNameWesternStyle());
       }
}
