package com.company;

public class Two {
    int sum;
    Two(int sum){
        this.sum = sum;
    }
    public static int two(int r,int arr[], int sum){

        for (int i=0;i<r;i++){
            sum += arr[i];
        }
        System.out.print("\nСумма: "+sum);
        return sum;
    }
}
