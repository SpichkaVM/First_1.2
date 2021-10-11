package com.company;

import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Mass Arr = new Mass();
        if (Arr.Long>1){
            One Z1 = new One();
            Z1.one(Arr.Long, Arr.arr, Arr.step);

            boolean b = true;
            do{
                System.out.print("\n========================");
                System.out.print("\nВыберите:\n");
                System.out.print("1.Вывести прогрэссию\n2.Сумма\n3.Кратные 3-м\n4.Сумма с середины до конца\n5.Выход\n");
                System.out.print("Выбор: ");
                int enter = in.nextInt();
                System.out.print("========================");
                switch (enter){
                    case (1):
                        Z1.Print(Arr.Long, Arr.arr, Arr.step);
                       break;
                    case (2):
                        Two Z2 = new Two(0);
                        Z2.two(Arr.Long, Arr.arr,Z2.sum);
                        break;
                    case (3):
                        Three Z3 = new Three();
                        Z3.three(Arr.Long, Arr.arr);
                        break;
                    case (4):
                        Four Z4 = new Four();
                        Z4.four();
                        break;
                    case (111):
                        Mass Arr2 = new Mass(Arr);
                        Z1.one(Arr2.Long, Arr2.arr, Arr2.step);
                        Z1.Print(Arr2.Long, Arr2.arr, Arr2.step);
                        break;
                    case (5):
                        b = false;
                        System.out.print("\nEnd");

                }

            }while(b==true);
        }else{
            System.out.print("\nНе корректный ввод");
        }
    }
}
