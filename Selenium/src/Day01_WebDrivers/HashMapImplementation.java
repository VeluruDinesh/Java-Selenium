package Day01_WebDrivers;

import java.util.HashMap;
import java.util.Map;

class HashMapImplementation extends MapOperations {
    private Map<String, Integer> map;

    public HashMapImplementation() {
        map = new HashMap<>();
    }

    @Override
    public void insert(String key, int value) {
        System.out.println("Key: Value: (" + key + ": " + value + ")");
        map.put(key, value);
    }

    @Override
    public void performOperations(String key) {
        if (map.containsKey(key)) {
            System.out.println(key + ": " + map.get(key));
        } else {
            System.out.println("Key not found");
        }
    }

    @Override
    public void delete(String key) {
        if (map.containsKey(key)) {
            map.remove(key);
            System.out.println("Key " + key + " removed from the map.");
        } else {
            System.out.println("Key not found");
        }
    }
}
