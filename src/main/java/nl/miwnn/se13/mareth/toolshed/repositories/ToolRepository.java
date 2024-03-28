package nl.miwnn.se13.mareth.toolshed.repositories;

import nl.miwnn.se13.mareth.toolshed.model.Tool;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Mareth Westhoff.

 */
public interface ToolRepository extends JpaRepository<Tool, Long> {
}
