import java.util.*;
public class Containsduplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        boolean duplicate=true;
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(set.contains(num)){
                duplicate=true;
                break;
            }set.add(num);
    }
    System.out.println(duplicate);
    }
}