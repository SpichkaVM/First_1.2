package com.company;
public class One {
    public static void one(int r,int arr[],int step){
        for (int i=0;i<r;i++){
            if (i==0){
                continue;
            }else{
                arr[i] = arr[i-1]+step;
            }
        }
    }

    public static void Print(int r,int arr[],int step){
        System.out.print("\nMass: ");
        for (int i=0;i<r;i++){
            System.out.print(arr[i]+" ");
        }
    }
}