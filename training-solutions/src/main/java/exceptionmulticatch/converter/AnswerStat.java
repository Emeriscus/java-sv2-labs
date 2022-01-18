package exceptionmulticatch.converter;

public class AnswerStat {

    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public BinaryStringConverter getBinaryStringConverter() {
        return binaryStringConverter;
    }

    public boolean[] convert(String text) {
        try {
            return binaryStringConverter.binaryStringToBooleanArray(text);
        } catch (NullPointerException | IllegalArgumentException iae) {
            throw new InvalidBinaryStringException("Binary string is not OK", iae);
        }
    }

    public int answerTruePercent(String answers) {

        boolean[] result = binaryStringConverter.binaryStringToBooleanArray(answers);
        int count = 0;
        for (boolean actual : result) {
            if (actual == true) {
                count++;
            }
        }
        return (int) (count / (double) result.length * 100);
    }
}
