//Return the element that occurs the maximum number of times.
import java.util.*;
public class Maxelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int num=arr[i];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        //create list
        List<List<Integer>> result = new ArrayList<>();
        for (Integer key : map.keySet()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(key);
            pair.add(map.get(key));
            result.add(pair);
        }
        int max=arr[0];
        int maxfreq=map.get(arr[0]);
        for(Integer key:map.keySet()){
            int freq=map.get(key);
            if(freq>max){
                maxfreq=freq;
                max=key;
            }
        }
        System.out.println("element with highest freq :"+max);
        System.out.println("Frequency :"+maxfreq);
        sc.close();
    }
}