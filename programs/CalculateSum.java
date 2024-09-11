package programs;

import java.util.Scanner;

public class CalculateSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        String choice=null;
        char choice;
        do {
            System.out.println("Enter Number: ");
            int num = scanner.nextInt();

            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum = sum + i;
            }
            System.out.println("Sum: " + sum);

            System.out.println("want to find sum again !? Y/N");
//           choice= scanner.next().trim().toUpperCase();
           choice= scanner.next().trim().toUpperCase().charAt(0);
//        }while (choice.equals("Y"));
        }while (choice=='Y');
        scanner.close();
        System.out.println("Good Bye!");
    }
}
