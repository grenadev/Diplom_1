package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

public class ActionWithIngredientTest {

    @Mock
    Ingredient ingredient;

    @Test
    public void addIngredientTest() throws Exception {
        // Arrange
        Burger burger = new Burger();

        //Act
        burger.addIngredient(ingredient);

        //Assert
        Assert.assertEquals(burger.ingredients.size(), 1);
    }

    @Test
    public void removeIngredientTest() throws Exception {

        // Arrange
        Burger burger = new Burger();

        //Act
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.removeIngredient(1);

        //Assert
        Assert.assertEquals(burger.ingredients.size(), 2);
    }

    @Test
    public void moveIngredientTest() throws Exception {

        // Arrange
        Burger burger = new Burger();
        Ingredient ingredientOne = new Ingredient(IngredientType.SAUCE,"ingredientOne",3);
        Ingredient ingredientTwo = new Ingredient(IngredientType.SAUCE,"ingredientTwo",4);
        Ingredient ingredientThree = new Ingredient(IngredientType.SAUCE,"ingredientThree",5);

        //Act
        burger.addIngredient(ingredientOne);
        burger.addIngredient(ingredientTwo);
        burger.addIngredient(ingredientThree);

        String name = burger.ingredients.get(2).name;

        burger.moveIngredient(2,1);

        //Assert
        Assert.assertEquals(burger.ingredients.get(1).getName(), name);
    }
}
