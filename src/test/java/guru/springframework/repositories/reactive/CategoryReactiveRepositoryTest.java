package guru.springframework.repositories.reactive;

import guru.springframework.domain.Category;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataMongoTest
public class CategoryReactiveRepositoryTest {

    @Autowired
    CategoryReactiveRepository categoryReactiveRepository;

    @Before
    public void setUp() throws Exception {
        categoryReactiveRepository.deleteAll().block();

//        StepVerifier.create(categoryReactiveRepository.deleteAll().log())
//                .expectSubscription().expectComplete();
    }

    @Test
    public void save() {
        Category category = new Category();
        category.setDescription("Foo");

        categoryReactiveRepository.save(category).block();
        Long count = categoryReactiveRepository.count().block();
        assertEquals(Long.valueOf(1L), count);

//        StepVerifier.create(categoryReactiveRepository.save(category).log())
//                .expectNextCount(1).verifyComplete();
//
//        StepVerifier.create(categoryReactiveRepository.count().log())
//                .consumeNextWith(count -> assertThat(1L).isEqualTo(count))
//                .verifyComplete();
    }

    @Test
    public void findByDescription() {
        Category category = new Category();
        category.setDescription("Foo");

        categoryReactiveRepository.save(category).then().block();

        Category fetchedCat = categoryReactiveRepository.findByDescription("Foo").block();

        assertNotNull(fetchedCat.getId());
    }
}