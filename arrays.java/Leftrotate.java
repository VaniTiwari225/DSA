import java.util.*;
public class Leftrotate {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int nums[]=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            int temp=nums[0];
            for(int i=0;i<n-1;i++){
                nums[i]=nums[i+1];
            }
             nums[n-1]=temp;
             System.out.println(Arrays.toString(nums));
    }
}