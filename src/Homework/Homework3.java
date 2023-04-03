package Homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework3 {
    public static int nameToNumberOccurence(List list, String name){
        return Collections.frequency(list,name);
    }
   public static void main(String[] args) {
        List<String > list = Arrays.asList("Vasia","Eddy","Vasia","Mary","Vasia");

       System.out.println("People names " + list);

       for (int i = 0; i < list.size(); i++) {
           if (nameToNumberOccurence(list, list.get(i)) == 1) {
               System.out.println(" People names " + list.get(i));
               System.out.println("The word Vasia is repeated " +
                       Collections.frequency(list, "Vasia"));
           }
       }
       /*People names [Vasia, Eddy, Vasia, Mary, Vasia]
          People names Eddy
          The word Vasia is repeated 3
           People names Mary
           The word Vasia is repeated 3 */

    }

}
/*  Дан список имен, где некоторые имена повторяются. Написать метод,который по имени вернет
    количество вхождений этого имени в список.
            Пример: nameToNumberOccurence(List list, String name)
    Vasia -> 3 */
