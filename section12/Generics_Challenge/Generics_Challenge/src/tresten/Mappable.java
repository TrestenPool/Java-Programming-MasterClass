package tresten;

import java.lang.reflect.Array;
import java.util.Arrays;

public interface Mappable {
    void render();

    static double[] stringToLatLon(String location){
        var splits = location.split(",");
        double lat = Double.parseDouble(splits[0]);
        double lon = Double.parseDouble(splits[1]);
        return new double[] {lat, lon};
    }

}

abstract class Point implements Mappable{
    private double[] location = new double[2];

    public Point(String location) {
        this.location = Mappable.stringToLatLon(location);
    }

    @Override
    public void render() {
        System.out.printf("Render %s as POINT (%s)\n", this.toString(), this.location());
    }

    // returns the location double array to the user in a string
    private String location(){
      return Arrays.toString(location);
    }

}

abstract class Line implements Mappable{
    private double[][] locations;

    public Line(String... locations){
        this.locations = new double[locations.length][2];
        int index = 0;
        for(String l : locations){
            this.locations[index++] = Mappable.stringToLatLon(l);
       }
    }


    @Override
    public void render() {
        System.out.printf("Render %s as Line(%s)\n", this.toString(), this.locations());
    }

    private String locations(){
        // Arrays.deepToString() prints out all of the elements in a multi-dimensional array unlike Arrays.toString() which only prints out a single row
        return Arrays.deepToString(locations);
    }
    
}
