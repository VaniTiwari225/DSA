import java.util.*;
public class Highestoccuringelement {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int nums[]=new int[n];
    for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
    }
    HashMap <Integer,Integer>map=new HashMap<>();
     for(int i=0;i<n;i++){
        int num=nums[i];
        if(map.containsKey(num)){
            int count=map.get(num);
            map.put(num,count+1);
        }else{
            map.put(num,1);
        }
    }
        int maxfreq=map.get(nums[0]);
        int maxele=nums[0];
        for(Integer key:map.keySet()){
            int freq=map.get(key);
            if(freq>maxfreq){
                maxfreq=freq;
                maxele=key;
            }
        }
        System.out.println("Highest occuring element is :"+maxele);
        }
    }