package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * Créé par dab4926 le 2021-07-11.
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(String recipeId, String ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(String recipeId, String idToDelete);
}
