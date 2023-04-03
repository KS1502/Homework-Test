package Homework;

import java.util.HashMap;
import java.util.Map;

public class Homework2 {
    public static void main(String[] args) {
        String[]strings = {"a", "b", "a", "c", "b"};
        String[]strings1 = {"c", "b", "a"};
        String[]strings2 = {"c", "c", "c", "c"};
        System.out.println(mapStringBoolean(strings));
        System.out.println(mapStringBoolean(strings1));
        System.out.println(mapStringBoolean(strings2));
        /* 1.{a=true, b=true, c=false}
        *  2. {a=false, b=false, c=false}
        *  3. {c=true} */
    }
   public static Map<String,Boolean>mapStringBoolean(String[] strings){
        Map<String,Boolean>nameToBoolean = new HashMap<>();

        for(String s : strings){
            if (nameToBoolean.containsKey(s)){
                nameToBoolean.put(s,true);
            }else {
                nameToBoolean.put(s,false);
            }
        }
        return nameToBoolean;
    }

}
/* Дан массив строк (не пустой). Написать метод, возвращающий мапу Map где каждая строка является ключем,
    а значением является true если строка в массиве встречается больше одного раза и false, если только один раз.
    Примеры:
    wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
    wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
    wordMultiple(["c", "c", "c", "c"]) → {"c": true} */
