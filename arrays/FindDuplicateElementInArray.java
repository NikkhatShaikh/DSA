package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/** Note:
 * 1- create duplicate list to store duplicate element.
 * 2-create hashset to store unique element.
 * 3- iterate array element through for each
 *    and store it into set.
 * 4- if the element is already in set .
 *    !set.add(num) return false, so it's a duplicate element
 *    then we add that element into duplicate list.
* */
public class FindDuplicateElementInArray {

    static List<Integer>  findDuplicate(int[] arr){
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num:arr){
            if(!set.add(num)){
                duplicates.add(num);
            }
        }
      return duplicates;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,2,1,8,5,9,9,8};
        List<Integer> duplicate = findDuplicate(arr);
        System.out.println("Duplicate Element "+duplicate);
    }
}
