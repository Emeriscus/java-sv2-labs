package stringconcat.nameconcat;

public class Name {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;



    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public String concatNameWesternStyle() {
        String westStyle ="";
        if (!(title == null)) {
            westStyle = westStyle.concat(title.getTitle() + " ");
        }
        if (!(givenName.equals(""))) {
            westStyle = westStyle.concat(givenName + " ");
        }
        if (!(middleName.equals(""))) {
            westStyle = westStyle.concat(middleName + " ");
        }
        if (!(familyName.equals(""))) {
            westStyle = westStyle.concat(familyName);
        }
        return westStyle;
    }

    public String concatNameHungarianStyle() {
        String hungStyle = "";
        if (!(title == null)) {
            hungStyle += title.getTitle() + " ";
        }
        if (!(familyName.equals(""))) {
            hungStyle += familyName + " ";
        }
        if (!(middleName.equals(""))) {
            hungStyle += middleName + " ";
        }
        if (!(givenName.equals(""))) {
            hungStyle += givenName;
        }
        return hungStyle;
    }
}
