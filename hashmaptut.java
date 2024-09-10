import java.util.HashMap;
import java.util.Map;

public class hashmaptut {
    public static void main(String [] args){
        Map<Integer,String> movielist=new HashMap<>();

        movielist.put(34,"Lord of the rings");
        movielist.put(78,"pointless");
        movielist.put(99,"poiiidd");
         
        for(Map.Entry<Integer,String> entry:movielist.entrySet()){
            if(entry.getKey()>78){
                movielist.replace(45, "edited ");
            }

            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
