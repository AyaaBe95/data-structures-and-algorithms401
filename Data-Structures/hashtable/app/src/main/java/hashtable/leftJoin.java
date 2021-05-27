package hashtable;

import java.util.*;
import java.util.List;



public class leftJoin {


    public static Map<String, List<String>> leftJoin(Map<String, String> leftTable, Map<String, String> rightTable) {

        Map<String, List<String>> leftJoined = new HashMap<>();
        for (Map.Entry<String, String> entryLeft : leftTable.entrySet()) {
            List<String> current = new ArrayList<>();
            current.add(entryLeft.getValue());
            if(rightTable.containsKey(entryLeft.getKey())) {
                current.add(rightTable.get(entryLeft.getKey()));
            }
            else {
                current.add(null);
            }
            leftJoined.put(entryLeft.getKey(), current);
        }
        return leftJoined;
    }
}
