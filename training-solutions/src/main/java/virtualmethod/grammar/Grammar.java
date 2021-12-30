package virtualmethod.grammar;

public class Grammar {

    public static void main(String[] args) {

        Verb phrasalVerb = new PhrasalVerb("ver", "át");
        Verb phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("ver", "át", "és");

        System.out.println(phrasalVerb.getWord()); //ver

        System.out.println(phrasalVerbWithSuffix.getWord()); //ver

        Preposition phrasalVerb2 = new PhrasalVerb("ver", "át");
        Preposition phrasalVerbWithSuffix1 = new PhrasalVerbWithSuffix("ver", "át", "és");

        System.out.println(phrasalVerb2.getPreposition()); //át
        System.out.println(phrasalVerb2.getWholeWord()); //átver

        System.out.println(phrasalVerbWithSuffix1.getPreposition()); //át
        System.out.println(phrasalVerbWithSuffix1.getWholeWord()); //verés

        PhrasalVerb phrasalVerb3 = new PhrasalVerb("ver", "át");
        PhrasalVerb phrasalVerbWithSuffix2 = new PhrasalVerbWithSuffix("ver", "át", "és");

        System.out.println(phrasalVerb3.getWord()); //ver
        System.out.println(phrasalVerb3.getPreposition()); //át
        System.out.println(phrasalVerb3.getWholeWord()); //átver

        System.out.println(phrasalVerbWithSuffix2.getWord()); //ver
        System.out.println(phrasalVerbWithSuffix2.getPreposition()); //át
        System.out.println(phrasalVerbWithSuffix2.getWholeWord()); //verés

        Suffix phrasalVerbWithSuffix3 = new PhrasalVerbWithSuffix("ver", "át", "és");

        System.out.println(phrasalVerbWithSuffix3.getSuffix()); //és

        PhrasalVerbWithSuffix phrasalVerbWithSuffix4 = new PhrasalVerbWithSuffix("ver", "át", "és");

        System.out.println(phrasalVerbWithSuffix4.getWord()); //ver
        System.out.println(phrasalVerbWithSuffix4.getPreposition()); //át
        System.out.println(phrasalVerbWithSuffix4.getSuffix()); //és
        System.out.println(phrasalVerbWithSuffix4.getWholeWord()); //verés
    }
}
