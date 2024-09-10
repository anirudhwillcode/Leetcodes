/**
 * Q) arr1 ,arr2 ,arr3 will be given uk what is this prob...... ist works for 2 arrays
 */
// public class ACCarraycompare {

//     public static void main(String[] args) {
//         int [] arr1={1,7,16,15,45,3};
//         int [] arr2={1,7,10,3,2};
        
//         int count=0;
//         for(int i=0;i<arr1.length;i++){
//             for(int j=0;j<arr2.length;j++){
//                 if(arr1[i]==arr2[j]){
//                     break;
//                 }

//                 if(j==arr2.length-1){
//                     count=count+1;
//                 }
//             }
//         }

//         System.out.println("The count is : "+count);
//     }
// }

import java.util.HashSet;
import java.util.Set;

public class ACCsetOperations {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {4, 5, 6, 7};
        Integer[] arr3 = {1, 7, 8, 9};

        Set<Integer> set1 = new HashSet<>(Set.of(arr1));
        Set<Integer> set2 = new HashSet<>(Set.of(arr2));
        Set<Integer> set3 = new HashSet<>(Set.of(arr3));

        // Elements in arr1 but not in arr2 or arr3
        Set<Integer> result1 = new HashSet<>(set1);
        result1.removeAll(set2);
        result1.removeAll(set3);
        System.out.println("Elements in arr1 but not in arr2 or arr3: " + result1.size());

        // Elements in arr2 but not in arr1 or arr3
        Set<Integer> result2 = new HashSet<>(set2);
        result2.removeAll(set1);
        result2.removeAll(set3);
        System.out.println("Elements in arr2 but not in arr1 or arr3: " + result2.size());

        // Elements in arr3 but not in arr1 or arr2
        Set<Integer> result3 = new HashSet<>(set3);
        result3.removeAll(set1);
        result3.removeAll(set2);
        System.out.println("Elements in arr3 but not in arr1 or arr2: " + result3.size());
    }
}
