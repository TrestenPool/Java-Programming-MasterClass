package tresten;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Park> nationalParks = new ArrayList<>(List.of(
               new Park("Yosemite", "37.8651,119.5383"),
                new Park("Big Bend", "29.2498,103.2502")
        ));

        List<River> knownRivers = new ArrayList<>(List.of(
                new River("Amazon", "12.312,51.123", "72.183,57.332"),
                new River("Concan", "51.381, 66.232", "71.444, 98.122")
        ));

        // park layer
        Layer<Park> parkLayer = new Layer<>(nationalParks.toArray(new Park[0]));
        parkLayer.renderLayer();

        System.out.println();

        // river layer
        Layer<River> riverLayer = new Layer<>(knownRivers.toArray(new River[0]));
        riverLayer.renderLayer();

    }

}