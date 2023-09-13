// enums
enum UsageType{ ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS }

public class Building implements  Mappable{
    // fields
    private String name;
    private UsageType usage;

    // constructor
    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    // implemented methods
    @Override
    public String getLabel() {
        return String.format("%s (%s)", this.name, this.usage);
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {

        return switch(usage){
            case ENTERTAINMENT -> String.format("%s %s", Color.GREEN, PointMarker.TRIANGLE);
            case GOVERNMENT -> String.format("%s %s", Color.RED, PointMarker.STAR);
            case RESIDENTIAL -> String.format("%s %s", Color.BLUE, PointMarker.SQUARE);
            case SPORTS -> String.format("%s %s", Color.ORANGE, PointMarker.PUSH_PIN);
            default -> String.format("%s %s", Color.BLACK, PointMarker.CIRCLE);
        };

    }


    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                , "name": "%s", "usage": "%s" """.formatted(this.name, this.usage);
    }
}
