import java.util.HashMap;
public class Population{
    public static void main(String[] args) {
        HashMap<String , Integer>map=new HashMap<>();

        map.put("india",100);
        map.put("China",300);
        System.out.println(map);
        map.put("india",200);
        System.out.println(map);
        
        //check if key india is present in the map or not
        if(map.containsKey("india")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        //check which value is assigned to a specific key
        System.out.println(map.get("india"));//key exists
        System.out.println(map.get("indonesia"));//key doesn't exist
    }
}