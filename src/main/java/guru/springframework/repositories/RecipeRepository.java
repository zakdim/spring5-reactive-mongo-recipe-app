package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by developer on 2021-06-09.
 */
public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
