package tresten;

public class River extends Line{
    private String name;

    // constructor
    public River(String name, String... locations) {
        super(locations);
        this.name = name;
    }


    @Override
    public String toString() {
        return String.format("%s River", this.name);
    }
}
