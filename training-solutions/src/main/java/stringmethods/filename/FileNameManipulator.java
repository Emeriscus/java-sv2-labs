package stringmethods.filename;

import java.util.Locale;

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        str = str.trim();

        return str.charAt(str.length()-1);
    }

    public String findFileExtension(String fileName) {
        fileName = fileName.trim();

        return fileName.substring(fileName.lastIndexOf("."));
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        ext = ext.trim();
        fileName = fileName.trim();

        return fileName.substring((fileName.lastIndexOf("."))+ 1).equals(ext);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {

        return searchedFileName.trim().equals(actualFileName.trim());
    }

    public String ChangeExtensionToLowerCase(String fileName) {
        fileName = fileName.trim();

        return fileName.substring(0, ((fileName.lastIndexOf("."))+ 1))
                + fileName.substring((fileName.lastIndexOf("."))+ 1).toLowerCase();
    }

    public String replaceStringPart(String fileName, String present, String target) {

        fileName = fileName.trim();
        return fileName.replace(present, target);
    }

    public static void main(String[] args) {

        FileNameManipulator fileNameManipulator = new FileNameManipulator();

        System.out.println(fileNameManipulator.findLastCharacter(" rgdfhdfghg hg dffhg  "));

        System.out.println(fileNameManipulator.findFileExtension("  sdfewf.erwfgwer  "));
        System.out.println(fileNameManipulator.identifyFilesByExtension(" exe ", "  sdffgfsd.exe "));
        System.out.println(fileNameManipulator.compareFilesByName(" abcd.exe   ", " abcd.exe  "));
        System.out.println(fileNameManipulator.ChangeExtensionToLowerCase("  fgdfrg.EXE "));
        System.out.println(fileNameManipulator.replaceStringPart("Pocsai Imre", "csa", "xxx"));
    }

}
