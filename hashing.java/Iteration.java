import java.util.*;
public class Iteration {
    public static void main(String[] args) {
        HashMap<String , Integer>map = new HashMap<>();
        map.put("India",200);
        map.put("china",400);

        for( Map.Entry<String ,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        map.remove("china");
        System.out.println(map);
    }
}