package guru.springframework.repositories;

import guru.springframework.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface RecipeRepository extends CrudRepository<Recipe, Long> {


}
