import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        //to insert element
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);

        //searching elements
        if(set.contains(10)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        //deleting elements from hashset
        set.remove(20);

        //size of the set
        System.out.println(set.size());

        //print all elements of the set
            System.out.println(set);

            //iteration
            Iterator it=set.iterator();

            while(it.hasNext()){
                System.out.println(it.next());
            }

    }
}