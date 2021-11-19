package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class RecipeTest {


    Recipe recipe = new Recipe();

    @Test
    public void testaddIngredients() {
        Path path = Paths.get("src/test/resources/recipe.txt");
        recipe.addIngredients(path);
        assertEquals("margarin", recipe.getIngredients().get(1));
    }

    @Test
    public void testaddIngredientsNonExistingFile() {
        Path path = Paths.get("src/test/resources/xyz.txt");

        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> recipe.addIngredients(path));
        assertEquals("Nem létező fájl, vagy útvonal.", ise.getMessage());

    }

}