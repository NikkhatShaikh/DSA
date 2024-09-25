package arrays;

import java.util.ArrayList;
import java.util.List;


public class FindAtLeastElementGreaterThanItSelf {
    public static void main(String[] args) {
        int arr[]={-3,-2,6,8,4,8,5};
        List<Integer> finalList= new ArrayList<>();

        for (int i=0;i<=arr.length-1;i++){
            for (int j=0;j<=arr.length-1;j++){
                if(arr[j]>arr[i]){
                    finalList.add(arr[i]);
                    break;
                }

            }
        }

        System.out.println(finalList);

    }
}
