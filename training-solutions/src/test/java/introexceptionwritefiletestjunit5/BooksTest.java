package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    Books books = new Books();

    @TempDir
    File temporaryFolder;

    @Test
    void writeBooksListToFileTest() throws IOException {

        Path path = temporaryFolder.toPath().resolve("writeBooksListToFileTest.txt");
        Path path2 = Paths.get("src/test/resources/books.txt");

        books.writeBooksListToFile(path, books.getBooksList(books.readFiles(path2)));

        List<String> excepted = Files.readAllLines(path);

        assertEquals(4, excepted.size());
        assertEquals("Jókai Mór: Kőszívű ember fiai", excepted.get(3));
    }
}