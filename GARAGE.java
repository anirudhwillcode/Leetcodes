import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class GARAGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of entries: ");
        int n = sc.nextInt();
        2
        List<Integer> listofexpense = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int total = 0;
            
            System.out.println("Entry " + (i + 1) + ":");
            
            System.out.print("Number of bikes: ");
            int bikes = sc.nextInt();

            System.out.print("Number of cars: ");
            int cars = sc.nextInt();

            System.out.print("Number of trucks: ");
            int trucks = sc.nextInt();

            total = (100 * bikes) + (250 * cars) + (500 * trucks);
            listofexpense.add(total);
        }
        
        int maxexpense = Collections.max(listofexpense);
        System.out.println("The maximum expense is: " + maxexpense);
    }
}
