package org.example;

import java.util.Scanner;
import java.util.Stack;

/*
1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
Пример:
1 -> 2->3->4
Вывод:
4->3->2->1
 */
public class Main {
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        int size = scaner.nextInt();
        Stack<Integer> list = InScanner(size);
        Stack<Integer> temp = new Stack<>();
        for (Integer item : list) {
            temp.add(item);

        }
        System.out.println(temp);
    }
    public static Stack InScanner (int n){
        Scanner scaner = new Scanner(System.in);
        Stack<Integer> list = new Stack<>();
        for (int i = 0; i < n; i++) {
            list.add(scaner.nextInt());
        }
        return list;
    }
}