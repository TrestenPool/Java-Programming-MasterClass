// enums
enum UtilityType { ELECTRICAL, FIBER_OPTIC, GAS, WATER }

public class UtilityLine implements Mappable{
    // fields
    private String name;
    private UtilityType type;

    // constructor
    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    // implemented methods

    @Override
    public String getLabel() {
        return String.format("%s (%s)", name, type);
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type){
            case ELECTRICAL -> String.format("%s %s", Color.RED, LineMarker.DASHED);
            case FIBER_OPTIC -> String.format("%s %s", Color.GREEN, LineMarker.DOTTED);
            case GAS -> String.format("%s %s", Color.ORANGE, LineMarker.SOLID);
            case WATER -> String.format("%s %s", Color.BLUE, LineMarker.SOLID);
            default -> String.format("%s %s", Color.BLACK, LineMarker.SOLID);
        };
    }


    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                , "name": "%s", "utility": "%s" """.formatted(this.name, this.type);
    }
}
