package com.company;

import java.util.Scanner;

public class Mass {
    int Long;
    int[] arr;
    int step;
    Mass(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину арифметической прогрессии: ");
        this.Long = in.nextInt();
        arr = new int[Long];
        System.out.print("Введите первый элемент арифметической прогрессии: ");
        this.arr[0] = in.nextInt();
        System.out.print("Введите шаг: ");
        this.step = in.nextInt();
    }
    Mass(Mass Arr){
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите длину арифметической прогрессии: ");
        this.Long = in.nextInt();
        arr = new int[Long];
        System.out.print("Введите первый элемент арифметической прогрессии: ");
        this.arr[0] = in.nextInt();
        System.out.print("Введите шаг: ");
        this.step = in.nextInt();
    }
}
