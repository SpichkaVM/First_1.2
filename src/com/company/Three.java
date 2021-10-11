package com.company;

public class Three {
    public static void three(int r,int arr[]){
        System.out.print("\nИндекс кратный 3-м: ");
        for (int i=0;i<r;i++){

            if ((i%3) == 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
