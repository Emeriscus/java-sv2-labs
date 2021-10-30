package enumtype.university;

public enum University {

    BME("BUDAPESTI MŰSZAKI ÉS GAZDASÁGTUDOMÁNYI EGYETEM"), SZTE("Szegedi Tudományegyetem"), SOTE("Semmelweis Egyetem");

    private final String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
