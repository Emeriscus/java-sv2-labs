package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    Recipe recipe = new Recipe();

    @Test
    void testaddIngredients() {
        Path path = Paths.get("src/test/resources/recipe.txt");
        recipe.addIngredients(path);
        assertEquals("citrom", recipe.getIngredients().get(4));
    }

    @Test
    void testaddIngredientsNonExistingFile() {
        Path path = Paths.get("src/test/resources/xyz.txt");
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> recipe.addIngredients(path));
        assertEquals("Nem létező fájl, vagy útvonal.", ise.getMessage());
    }

}