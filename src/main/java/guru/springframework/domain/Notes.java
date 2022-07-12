package guru.springframework.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 * Created by developer on 2021-06-07.
 */
@Getter
@Setter
@EqualsAndHashCode
public class Notes {

    @Id
    private String id;
//    private Recipe recipe;
    private String recipeNotes;

}
