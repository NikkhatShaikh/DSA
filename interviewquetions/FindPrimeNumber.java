package interviewquetions;

public class FindPrimeNumber {
    public static void main(String[] args) {

        int prime = findPrime(4);

        if(prime==2){
            System.out.println("prime");
        }else {
            System.out.println("Not prime");
        }

    }
    public static int findPrime(int n){
        int count=0;
        for (int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }

        return count;
    }
}
