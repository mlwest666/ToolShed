package nl.miwnn.se13.mareth.toolshed.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/**
 * @author Mareth Westhoff.
 * Specific item of a tool unique instances which is either available or lend out
 */

@Entity
public class Item {
    @Id @GeneratedValue
    private Long itemId;

    private Boolean isAvailable = true;

    @ManyToOne
    private Tool tool;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}
