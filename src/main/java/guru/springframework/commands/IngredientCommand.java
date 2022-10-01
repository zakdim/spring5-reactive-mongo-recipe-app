package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Créé par dab4926 le 2021-07-01.
 */
@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    private String id;
    private String recipeId;

    @NotBlank
//    @Size(min = 1, max = 255)
    private String description;

    @NotNull
    @Min(1)
    private BigDecimal amount;

    @NotNull
    private UnitOfMeasureCommand uom;
}
