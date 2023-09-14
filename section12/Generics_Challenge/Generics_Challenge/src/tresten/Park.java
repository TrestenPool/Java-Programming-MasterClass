package tresten;

public class Park extends Point{
    private String name;

    // constructor
    public Park(String name, String location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s National Park", this.name);
    }
}