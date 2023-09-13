// enums
enum Geometry { LINE, POINT, POLYGON }
enum Color{ BLACK, BLUE, GREEN, ORANGE, RED }
enum PointMarker{ CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE }
enum LineMarker{ DASHED, DOTTED, SOLID }

public interface Mappable {
    // any properties specified in interface are public static by default
    String JSON_PROPERTY = """ 
            "properties": {%s}
            """;

    // abstract methods
    abstract String getLabel();
    abstract Geometry getShape();
    abstract String getMarker();

    // default method
    default String toJson(){
        return """
                "type": "%s", "label": "%s", "marker": "%s" """
                .formatted(getShape(), getLabel(), getMarker());
    }

    // static method
    static void mapIt(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJson()));
    }

}
