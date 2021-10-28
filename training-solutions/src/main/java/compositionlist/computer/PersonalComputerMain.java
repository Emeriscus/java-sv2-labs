package compositionlist.computer;

import javax.sound.midi.Soundbank;

public class PersonalComputerMain {
    public static void main(String[] args) {

//      Cpu cpu = new Cpu("Intel486", 877);
        PersonalComputer personalComputer = new PersonalComputer(new Cpu("Intel486", 877)); // ugyanaz, mint a fenti!!

        System.out.println(personalComputer.getCpu());

        personalComputer.addHardware(new Hardware("Dell", "Optiplex 960"));
        personalComputer.addSoftware(new Software("Windows", 10));


        System.out.println(personalComputer.getHardwares());
        System.out.println(personalComputer.getSoftwares());

        personalComputer.addHardware(new Hardware("HP Laserjet", "M1132"));
        personalComputer.addHardware(new Hardware("Trust mouse", "15862"));

        personalComputer.addSoftware(new Software("MS Offide", 2013));
        personalComputer.addSoftware(new Software("IntelliJ Idea", 2021.2));

        System.out.println(personalComputer.getHardwares());
        System.out.println(personalComputer.getSoftwares());

        System.out.println(personalComputer.getSoftwares().get(0));
        System.out.println(personalComputer.getHardwares().get(2));

    }
}
