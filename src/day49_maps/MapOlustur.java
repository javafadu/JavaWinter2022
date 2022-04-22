package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {

    public static Map<Integer,String> myMap() {
        Map<Integer,String> sinifList = new HashMap<>();

        sinifList.put(101,"Ali, Can, Dev, 1453");
        sinifList.put(102,"Veli, Yan, QA, 2001");
        sinifList.put(103,"Veli, Yan, C#, 2002");
        sinifList.put(104,"Ayse, Kan, C#, 2001");
        sinifList.put(105,"Fatma, Han, Java, 2003");

        return sinifList;
    }

}