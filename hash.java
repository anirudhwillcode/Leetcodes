import java.util.*;
import java.util.Map;
class hash{
    public static void main(String [] args){
        Map<Integer,Integer>freqmap=new HashMap<>();

        int [] numbers={5,6,9,8,6,5,5,5,2,3,4,5,6,6,8,99,65,4};

        for(int i:numbers){
            if(freqmap.containsKey(i)){
                freqmap.put(i,freqmap.get(i)+1);
            }else{
                freqmap.put(i,1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: freqmap.entrySet()){
            Integer key=entry.getKey();
            Integer value=entry.getValue();

            System.out.println("Number: "+ key + " Frequency: "+ value);

        }

    }


}