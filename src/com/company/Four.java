package com.company;

import java.util.Scanner;

public class Four {
    public static void four(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите строку: ");
        String str = in.nextLine();
        String strArr[] = str.split("  | ");
        int arr[] = new int[strArr.length];
        int sum = 0;
        System.out.print("С середины до конца: ");
        for(int i =(strArr.length/2); i < strArr.length; i++){
            arr[i] = Integer.parseInt(strArr[i]);
            sum += arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nСумма: "+sum);
    }
}
