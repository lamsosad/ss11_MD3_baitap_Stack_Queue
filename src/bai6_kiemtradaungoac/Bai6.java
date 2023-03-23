package bai6_kiemtradaungoac;

import java.util.Scanner;
import java.util.Stack;

public class Bai6 {
    public static void main(String[] args) {
        Stack stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập biểu thức cần kiểm tra dấu:");
        String str = input.nextLine();
        char sym;
        boolean check = false;
        for (int i = 0; i < str.length(); i++) {
            sym = str.charAt(i);
            if (sym == '(') {
                stack.push(sym);
            }
            if (sym == ')') {
                if (stack.isEmpty()) {
                    check = false;
                }
                char left = (char) stack.pop();
                if (left != sym)
                    check = false;
            }
        }
        if (stack.isEmpty()) {
            check = true;
            System.out.println("Well!");
        } else{
            check=false;
            System.out.println("Thiếu dấu ngoặc");
        }
    }
}
