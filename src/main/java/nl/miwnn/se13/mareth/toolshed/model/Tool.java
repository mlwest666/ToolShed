package nl.miwnn.se13.mareth.toolshed.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Mareth Westhoff.
 * Represents a tool of which our shed can contain multiple items
 */
@Entity
public class Tool {
    @Id @GeneratedValue
    private Long toolId;
    private String name;
    private String application;

    public Tool(String name, String application) {
        this.name = name;
        this.application = application;
    }

    public Tool() {

    }

    public Long getToolId() {
        return toolId;
    }

    public void setToolId(Long toolId) {
        this.toolId = toolId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getName() {
        return name;
    }

    public String getApplication() {
        return application;
    }
}
