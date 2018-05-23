package ch11;

/*  Write a method called subMap that accepts two maps from strings to strings as its parameters and returns true
if every key in the first map is also contained in the second map and maps to the same value in the second map.
For example, {Smith=949–0504, Marty=206–9024}
is a submap of {Marty=206–9024, Hawking=123–4567, Smith=949–0504, Newton=123–4567}.
The empty map is a submap of every map.
*/

import java.util.HashMap;
import java.util.Map;

public class opg17
{
    public static void main(String[] args) {

        Map<String, String> mapOne = new HashMap<>();
        Map<String, String> mapTwo = new HashMap<>();

        mapOne.put("Smith", "949-0504");
        mapOne.put("Marty", "206-9024");

        mapTwo.put("Marty", "206-9024");
        mapTwo.put("Hawking", "123-4567");
        mapTwo.put("Smith", "949-0504");
        mapTwo.put("Newton", "123-4567");

        System.out.println(subMap(mapOne,mapTwo));
    }

    private static boolean subMap (Map<String, String> map1, Map<String, String> map2){
        int count = 0;
        for (Map.Entry<String, String> entry : map1.entrySet()){
            if(map2.containsKey(entry.getKey()) && map2.containsValue(entry.getValue())){
                count++;
            } else {
                count--;
            }
        }
        if (count == map1.size()){
            return true;
        } else {
            return false;
        }
    }

}
