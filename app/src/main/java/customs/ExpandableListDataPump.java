package customs;

/**
 * Created by diego on 19/04/16.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> sector1 = new ArrayList<String>();
        sector1.add("Subsector 1");
        sector1.add("Subsector 2");
        sector1.add("Subsector 3");
        sector1.add("Subsector 4");
        sector1.add("Subsector 5");




        List<String> sector3 = new ArrayList<String>();
        sector3.add("Subsector 1");
        sector3.add("Subsector 2");
        sector3.add("Subsector 3");
        sector3.add("Subsector 4");
        sector3.add("Subsector 5");

        List<String> sector2= new ArrayList<String>();
        sector2.add("Subsector 1");
        sector2.add("Subsector 2");
        sector2.add("Subsector 3");
        sector2.add("Subsector 4");
        sector2.add("Subsector 5");

        //expandableListDetail.put("SECTOR 02", sector2);
        expandableListDetail.put("SECTOR 01", sector1);

        expandableListDetail.put("SECTOR 02", sector2);
        expandableListDetail.put("SECTOR 03", sector3);
        return expandableListDetail;
    }
}