package arrays;

import java.util.*;
/**
 * 1- declare & initialize set to avoid duplicate number
 * 2- !uniqueList.add(num) - return true if duplicate number found.
 * 3- return duplicate num if found
 * 4- return -1 if duplicate not found
 *
 * */
public class FindFirstDuplicateElement {
    static int findFirstDuplicateElement(int[] arr){
        Set<Integer> uniqueList= new HashSet<>();
        for (int num:arr){
            if(!uniqueList.add(num)){
                return num;
            }
        }
       return -1;
    }
    public static void main(String[] args) {

        int[] arr= {2,3,4,3,1,2,6,7,3};
         int firstDuplicateElement = findFirstDuplicateElement(arr);
        System.out.println("firstDuplicateElement: "+firstDuplicateElement);
    }
}
