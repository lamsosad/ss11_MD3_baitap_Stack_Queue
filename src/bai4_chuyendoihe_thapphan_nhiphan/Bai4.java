package bai4_chuyendoihe_thapphan_nhiphan;

import java.util.Scanner;
import java.util.Stack;

public class Bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số muốn chuyển đổi: ");
        int number = input.nextInt();
        ConvertDecimalToDecimalSystem(number);
    }

    public static void ConvertDecimalToDecimalSystem(int num) {
        Stack stack = new Stack<>();
        String banary = "";
        if (num == 0) {
            banary = "0";
        } else
            while (num > 0) {
                stack.push(num % 2);
                num = num / 2;
            }
        while (!stack.isEmpty()) {
            banary += stack.pop();
        }
        System.out.println("Hệ nhị phân là: (0"+banary+")B");
    }

}
