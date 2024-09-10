import java.util.ArrayList;
import java.util.List;

public class ACCquest {
    public static void main(String[] args) {
        String s1="mystery";
		String s2="legend";
	   	
		char [ ] s1chararray = s1.toCharArray();
		char [ ] s2chararray=s2.toCharArray();
		
		List<Character>setofnum= new ArrayList<>();
		
	
for(int i=0;i<s1chararray.length;i++)
{
	for(int j=0;j<s2chararray.length;j++){

		if (s1chararray[i] == s2chararray[j]&& !setofnum.contains(s1chararray[i]))
        {
				setofnum.add(s1chararray[i]);
		}

    }	
} 
   
    
				
int asciiSum = 0;
for (char ch : setofnum) {
    asciiSum += (int) ch; // Convert the character to its ASCII value and add it to the sum
}

     
   System.out.println(asciiSum);

    }
}
