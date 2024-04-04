package nl.miwnn.se13.mareth.toolshed.repositories;

import nl.miwnn.se13.mareth.toolshed.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Mareth Westhoff.
 * Doel
 */
public interface ItemRepository extends JpaRepository<Item, Long> {
}
