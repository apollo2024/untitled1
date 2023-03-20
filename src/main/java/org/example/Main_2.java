package org.example;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
public class Main_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(Check(input));
    }
    public static boolean Check(String input) {
        Stack<Character> item = new Stack<>();
        for(char i : input.toCharArray())
            if(i=='{' || i=='(' || i=='[' ) {
                item.push(i);
            }
            else{
                if(item.empty() || (i==')' && item.peek()!='(') || (i=='}' && item.peek()!='{') || (i==']' && item.peek()!='[') ) {
                    return false;
                }
                item.pop();
            }
        return item.empty();
    }
}

