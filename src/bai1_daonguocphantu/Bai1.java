package bai1_daonguocphantu;

import java.util.Scanner;
import java.util.Stack;

public class Bai1 {
    public static void main(String[] args) {
        //đảo ngược chuỗi số
        System.out.println("**************Stack**************");
        Stack<Integer> arr = new Stack<>();
        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.push(4);
        arr.push(5);
        arr.push(6);
        arr.push(7);
        System.out.println("Mảng cũ là: " + arr);
        Stack<Integer> newArr = new Stack<>();

        while (!arr.isEmpty()) {
            newArr.push(arr.pop());
        }
        System.out.println("Mảng mới là: " + newArr);

        //đảo ngược kí tự chuỗi
        System.out.println("\n\n**************wStack**************");
        Stack<String> wStack = new Stack<>();
        System.out.println("nhap string");
        java.lang.String string = new Scanner(System.in).nextLine();
        for (int i = 0; i < string.length(); i++) {
            wStack.push(String.valueOf(string.charAt(i)));
        }
        String str = "";

        System.out.println("Mảng cũ là: " + wStack);
        while (!wStack.isEmpty()) {
           str+= wStack.pop();
        }


        System.out.println("Mảng mới là: " +str);
    }
}

