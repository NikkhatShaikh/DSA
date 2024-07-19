package arrays;
/**
 * 1- inside loop check the current element is equal to target
 * 2 - if we find a match return index of element
 * 3- if reach out loop without find a match will return -1 to indicate target element not in arrayList
 * */
public class FindIndexOfElement {

    static int findIndexOfElement(int arr[],int target){

        for (int i =0 ;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5}; // target element  3 and its index is 2
        int target =5 ;
        int indexOfElement = findIndexOfElement(arr, target);
        System.out.println(" indexOfElement "+indexOfElement);
    }
}
