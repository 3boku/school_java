package Collection;

import java.util.HashMap;

public class HashMapExam {
    public static void main(String[] args) {
        HashMap<String, Integer>  map = new HashMap<>();

        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);

        System.out.println("총 학생수: " + map.size());
        System.out.println(map);

        System.out.println("++++++++++++++++");

        System.out.println(map.get("유재석"));

        map.remove("유재석, 15");

        for(String string : map.keySet()){
            System.out.println(string);
        }
        for(int v : map.values()){
            System.out.println(v);
        }

        for(String key:map.keySet()){
            System.out.println("고객이름" + key + "포인트"  + map.get(key));
        }
    }
}
