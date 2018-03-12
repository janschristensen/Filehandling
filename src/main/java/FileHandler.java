import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileHandler {
    public String[] loadFile(Path path) {
        List<String> list = new ArrayList<String>();
        try {
            list.addAll(Files.readAllLines(path, Charset.forName("UTF-8")));
        } catch (IOException e) {
            //log , e
            return null;
        }
        return list.toArray(new String[list.size()]);
    }

    public boolean writeFile(Path path, String[] lines) {
        List<String> list = Arrays.asList(lines);
        try {
            Files.write(path, list, Charset.forName("UTF-8"));
        } catch (IOException e) {
            //log , e
            return false;
        }
        return true;

    }
}
