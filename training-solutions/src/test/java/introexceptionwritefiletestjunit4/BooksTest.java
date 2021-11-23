package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class BooksTest {

    private Books books = new Books();

    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    @Test
    public void writeBooksListToFileTest() throws IOException {

        Path path = temp.newFile("booksOrdered.txt").toPath();
        Path path2 = Paths.get("src/test/resources/books.txt");

        books.writeBooksListToFile(path, books.getBooksList(books.readFiles(path2)));

        assertEquals(4, Files.readAllLines(path).size());
        assertEquals("Fekete István: Tüskevár", Files.readAllLines(path).get(2));
    }
}