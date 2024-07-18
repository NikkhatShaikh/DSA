package arrays;

import java.util.Arrays;

public class InitializeArraysAndIterate {
    public static void main(String[] args) {
        int arr[] ={20,5,10,3,50,15,30};

        System.out.println("----------for each------");
        for (int a:arr){
            System.out.println(a);
        }


        System.out.println("--------arrays steam------");
        Arrays.stream(arr).forEach(System.out::println);



        System.out.println("---------for loop----------");
        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }


        System.out.println("---------while loop---------");
        int i=0;
        while (i< arr.length){
            System.out.println(arr[i]);
            i++;
        }


        System.out.println("-----------do while---------");
        int j=0;
        do{// execute at least once a block of code without checking condition and executed code until condition matches
            System.out.println(arr[j]);
            j++;
        }while (j< arr.length);
    }

}
