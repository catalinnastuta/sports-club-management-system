public class Membership {
    private String name;
    private String description;

    public Membership(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}