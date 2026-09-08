package Practice.Map;

import Practice.Dto.Person;
import Practice.Interface.CollectionPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice implements CollectionPractice<Person> {

    @Override
    public void print(Person input) {
        Map<Integer, String>   m = new HashMap<>();
        m.put(1, "TEST");
        m.put(2, "POJO");
        m.put(null, "09");

        m.putIfAbsent(null, "null override");

        System.out.println("Map Traversal entrySet");
        for(Map.Entry<Integer, String> entryMap: m.entrySet()){
            System.out.printf("Key=%s,Value=%s\n", entryMap.getKey(), entryMap.getValue());
        }
        System.out.println("---------------------------------");
        System.out.println("Map Traversal keySet");
        for(Integer key: m.keySet()){
            System.out.printf("Key=%s,Value=%s\n", key, m.get(key));
        }
        System.out.println("---------------------------------");
        System.out.println("Map Traversal Values");
        for(String value: m.values()){
            System.out.printf("Value=%s\n", value);
        }
        System.out.println("---------------------------------");

    }
}
