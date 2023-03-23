package bai2_dem_so_lan_xuat_hien;

import java.util.Scanner;
import java.util.TreeMap;

public class Bai2 {
    public static void main(String[] args) {
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi kí tự: ");
        String string = input.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (treeMap.get(string.charAt(i)) == null) {
                treeMap.put(string.charAt(i), 1);
            } else {
                treeMap.replace(string.charAt(i), treeMap.get(string.charAt(i)) + 1);
            }
        }
        System.out.println(treeMap);
    }

}
