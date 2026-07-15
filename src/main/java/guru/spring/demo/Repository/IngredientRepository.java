package guru.spring.demo.Repository;

import guru.spring.demo.Model.Ingredient;

import java.util.Optional;
public interface IngredientRepository {

    Iterable<Ingredient> findAll();
    Optional<Ingredient> findByID(String id);

    Ingredient save(Ingredient ingredient);
}
