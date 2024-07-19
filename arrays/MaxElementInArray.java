package arrays;



public class MaxElementInArray {
    public static void main(String[] args) {
        int num[] = {3,5,2,7,1,30};

        int max=num[0];
        for (int i=1;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("max "+max);

    }
}
