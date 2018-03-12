
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class FileHandlerTest {

    @Test
    public void testLoadFile() {
        FileHandler sut = new FileHandler();
        Path path = Paths.get(".", "teams.txt");
        System.out.println("path.toString() = " + path.toAbsolutePath());
        String[] lines = sut.loadFile(path);
        assertNotNull("Loaded file should not be null", lines);
        System.out.println("lines = " + Arrays.asList(lines));
    }

    @Test
    public void testSaveFile() {
        FileHandler sut = new FileHandler();
        Path path = Paths.get(".", "teams.txt");
        System.out.println("path.toString() = " + path.toAbsolutePath());
        List<String> list = Arrays.asList("Jan", "Jonas", "Søren");
        String[] lines = list.toArray(new String[list.size()]);
        assertTrue("File write failed", sut.writeFile(path, lines));
    }
}
