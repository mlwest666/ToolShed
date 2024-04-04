package nl.miwnn.se13.mareth.toolshed.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

/**
 * @author Mareth Westhoff.
 * Represents a tool of which our shed can contain multiple items
 */
@Entity
public class Tool {
    @Id
    @GeneratedValue
    private Long toolId;
    private String name;
    private String application;

    @OneToMany(mappedBy = "tool")
    private List<Item> items;

    public int getAvailableItems() {
        int count = 0;
        for (Item item : items) {
            if (item.getAvailable()) {
                count++;
            }
        }
        return count;
    }

    public int getTotalItems() {
    return items.size();
    }

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
