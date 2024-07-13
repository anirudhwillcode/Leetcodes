import java.util.ArrayList;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(45);
        list.add(67);
        list.add(89);
        list.add(90);
        list.add(789);

        System.out.println(list);

        ArrayList<Integer>newList=new ArrayList<>();
        newList.add(890);
        newList.add(899);
        
        newList.addAll(list);
        
        
        System.out.println("Removing element"+newList.get(5));
        newList.remove(5);
        System.out.println(newList);

    }
}
