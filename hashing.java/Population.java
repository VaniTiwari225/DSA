import java.util.HashMap;
public class Population{
    public static void main(String[] args) {
        HashMap<String , Integer>map=new HashMap<>();

        map.put("india",100);
        map.put("China",300);
        System.out.println(map);
        map.put("india",200);
        System.out.println(map);
    }
}