package arrays;

public class FindMissingNumberFromArray {
    public static void main(String[] args) {

        int arr[] = {1,2,4,5,6}; // n= 5  missing number =1 total n=5+1  n=6
        int totalNumber = arr.length+1; // totalNumber = 5+1 = 6

        int expectedSum = totalNumber * (totalNumber+1)/2;  // Sum of first n natural numbers
        int actualSum = 0 ;
        int missingNumber = 0 ;

        for (int i=0;i<arr.length;i++){
            actualSum+=arr[i];
        }

        missingNumber=expectedSum-actualSum;
        System.out.println(" missingNumber "+missingNumber);

    }
}
