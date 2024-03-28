package nl.miwnn.se13.mareth.toolshed.model;

/**
 * @author Mareth Westhoff.
 * Doel
 */
public class Tool {
    private String name;
    private String application;

    public Tool(String name, String application) {
        this.name = name;
        this.application = application;
    }

    public String getName() {
        return name;
    }

    public String getApplication() {
        return application;
    }
}
