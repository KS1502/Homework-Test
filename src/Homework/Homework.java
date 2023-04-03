package Homework;

import java.util.HashMap;
import java.util.Map;

public class Homework {
    public static void main(String[] args) {
        Map<String,String>mapAB = new HashMap<>();
        mapAB.put("a","Hi");
        mapAB.put("b","There");
        System.out.println(ab(mapAB));

        /*{a=Hi, ab=HiThere, b=There} */

    }
    public static Map<String,String>ab(Map<String,String>mapAB){
        if(mapAB.containsKey("a")&& mapAB.containsKey("b")){
            String key = "ab";
            String value = mapAB.get("a").concat(mapAB.get("b"));
            mapAB.put(key,value);
        }
        return mapAB;
    }



}
   /* Дана Map map, написать метод, который вернет мапу, такую, что если в исходной map
   есть ключи ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b в качестве
   значения. Если нет, ничего не менять
        Примеры:
        mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
        mapAB({"a": "Hi"}) → {"a": "Hi"}
        mapAB({"b": "There"}) → {"b": "There"} */
