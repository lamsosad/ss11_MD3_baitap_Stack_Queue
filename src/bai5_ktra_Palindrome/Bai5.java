package bai5_ktra_Palindrome;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ");
        String string = input.nextLine();
        for (int i = 0; i < string.length(); i++) {
            char text = string.charAt(string.length() - i - 1);
            if (string.charAt(i) == text) {
                System.out.println("Chuỗi này là chuỗi Panlyndrome.");
                break;
            } else {
                System.out.println("Chuỗi này không là chuỗi Panlyndrome.");
                break;
            }
        }
    }
}
