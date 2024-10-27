package interviewquetions;

// print 5-1 numbers
public class Recursion {
    public static void main(String[] args) {
        int n =5;
        printNum(n);

//        for (int i=5;i>=0;i--){
//            System.out.println(i);
//        }
    }

    public static void printNum(int n){
        if (n==0)
            return;
        System.out.println(n);
        printNum(n-1);
    }


}
