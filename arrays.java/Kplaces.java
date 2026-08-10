//Given an integer array nums and 
// a non-negative integer k, rotate the array to the left by k steps.
import java.util.*;
public class Kplaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            nums[i]=nums[i+1];
            
        }
        System.out.println(Arrays.toString(nums));
    }
}