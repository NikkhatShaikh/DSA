package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMaxElement {

    //----------------------find max element-------------------
    static int findMaxElement(int[] arr){
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


    //---------------find duplicate element ------------------------

    static List<Integer> findDuplicate(int[] arr){
        List<Integer> duplicateElement = new ArrayList<>();
        Set<Integer> uniqueElement = new HashSet<>();

        for (int num:arr){
            if(! uniqueElement.add(num)){
                duplicateElement.add(num);
            }
        }
        return duplicateElement;

    }


    public static void main(String[] args) {
         int arr[] = {2,5,1,7,6,10,5,20,1,20};
        int maxElement = findMaxElement(arr);
        System.out.println("max number : "+maxElement);

        List<Integer> duplicate = findDuplicate(arr);
        System.out.println("Duplicate element list "+duplicate);
    }
}
