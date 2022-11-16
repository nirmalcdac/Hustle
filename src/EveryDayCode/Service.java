package EveryDayCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*Develop an algorithm that,
when invoking the Service Registry's get() method multiple times,
should return one backend-instance choosing between the registered ones randomly.
*/
public class Service {
    Map<String, String> serviceMap = new HashMap<>();

    Service() {
    }

    public String addEntry(String address, String instance) {
        if (serviceMap.size() < 10) {
            if (serviceMap.containsKey(address)) {
                return "Duplicate Entry";
            } else {
                serviceMap.put(address, instance);
                return serviceMap.get(address);
            }
        } else {
            return "Can Not Add More entries";
        }
    }

    public String get() {
        Random random = new Random();
        return serviceMap.get("Address" + random.nextInt(10));
    }
}
