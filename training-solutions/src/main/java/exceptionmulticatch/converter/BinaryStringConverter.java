package exceptionmulticatch.converter;

import java.util.ArrayList;
import java.util.List;

public class BinaryStringConverter {


    public boolean[] binaryStringToBooleanArray(String binaryString) {

        if (binaryString.isBlank()){
            throw new NullPointerException("String is empty.");
        }

        boolean[] result =new boolean[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
                throw new IllegalArgumentException("Binary string is not valid.");
            }
            if (binaryString.charAt(i) == '1') {
                result[i] = true;
            } else {
                result[i]=false;
            }
        }
        return result;
    }

    public String booleanArrayToBinaryString(boolean[] logicalString) {

        if (logicalString.length==0){
            throw new IllegalArgumentException("Boolean array is empty.");
        }

        List<String> result =new ArrayList<>();



        return null;
    }
}
