package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations {

    private Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    @Override
    public String getLongWord() {
        StringBuilder sb = new StringBuilder();
        List<String> lines = FileOperations.super.readFromFile(path);
        for (int i = 0; i < lines.size(); i += lines.size() - 1) {
            sb.append(lines.get(i));
        }
        return sb.toString();
    }
}
