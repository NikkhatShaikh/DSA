package programs;

public class SearchElementFromArray {

    public static void main(String[] args) {
        int arr[] ={2,4,5,67,7,8};

        int i = searchElement(arr, 7);
        System.out.println("index element: "+i);
        if(i==-1){
            System.out.println("Not Found");
        }else {
            System.out.println("found");
        }
    }
    public static int searchElement(int arr[],int k) {

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] ==k){
                return i;
                //return arr[i] if want index element value
            }
        }
        return -1;
    }
}
