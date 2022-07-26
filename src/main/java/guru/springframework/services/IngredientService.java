package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;
import reactor.core.publisher.Mono;

/**
 * Créé par dab4926 le 2021-07-11.
 */
public interface IngredientService {

    Mono<IngredientCommand> findByRecipeIdAndIngredientId(String recipeId, String ingredientId);

    Mono<IngredientCommand> saveIngredientCommand(IngredientCommand command);

    Mono<Void> deleteById(String recipeId, String idToDelete);
}
