package guru.springframework.repositories.reactive;

import guru.springframework.domain.Recipe;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.test.StepVerifier;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataMongoTest
public class RecipeReactiveRepositoryTest {

    @Autowired
    RecipeReactiveRepository recipeReactiveRepository;

    @Before
    public void setUp() throws Exception {
//        recipeReactiveRepository.deleteAll().block();

        StepVerifier.create(recipeReactiveRepository.deleteAll().log())
                .expectSubscription().verifyComplete();
    }

    @Test
    public void testRecipeSave() {
        Recipe recipe = new Recipe();
        recipe.setDescription("Yummy");

//        recipeReactiveRepository.save(recipe).block();
//        Long count = recipeReactiveRepository.count().block();
//        assertEquals(Long.valueOf(1L), count);

        StepVerifier.create(recipeReactiveRepository.save(recipe).log())
                .expectSubscription().expectNextCount(1).verifyComplete();

        StepVerifier.create(recipeReactiveRepository.count().log())
                .consumeNextWith(count -> assertThat(Long.valueOf(1L)).isEqualTo(count))
                .verifyComplete();
    }
}