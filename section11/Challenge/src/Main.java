import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // setup a list of buildings
        List<Mappable> buildings = new ArrayList<>(Arrays.asList(
                new Building("Sydney Town Hall", UsageType.GOVERNMENT),
                new Building("Sydney Opera House", UsageType.ENTERTAINMENT),
                new Building("Stadium Australia", UsageType.SPORTS)
        ));

        // setup a list of utility lines
        List<Mappable> utility_lines = new ArrayList<>(Arrays.asList(
                new UtilityLine("College St", UtilityType.WATER),
                new UtilityLine("Public Library", UtilityType.GAS),
                new UtilityLine("Gas Pump", UtilityType.GAS),
                new UtilityLine("AT&T", UtilityType.FIBER_OPTIC)
        ));

        printList(buildings);
        printList(utility_lines);

    }

    // static method to print all of the mappables in a provided list
    public static void printList(List<Mappable> mappables){
        for(var map : mappables){
            Mappable.mapIt(map);
        }
    }
}