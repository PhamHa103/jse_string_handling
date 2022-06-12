import jdk.nashorn.internal.ir.IfNode;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Bài 1. Sử dụng xâu ký tự để viết hàm kiểm tra số thuận nghịch.
        // Áp dụng liệt kê các số thuận nghịch có 6 chữ số.

        //1. Kiểm tra 1 số có phải là số thuận nghịch hay không
        System.out.print("Xin mời nhập số cần kiểm tra: ");
        int inputNumber = new Scanner(System.in).nextInt();
        if (checkSoTN(inputNumber))
            System.out.println("Số đã nhập là số thuận nghịch.");
        else
            System.out.println("Số đã nhập không phải là số thuận nghịch");

        System.out.println("----------------------------");
        //2. Áp dụng tìm các số thuận nghịc có 6 chữ số
        System.out.println("Các số thuận nghịch có 6 chữ số là: ");
        for (int i = 100000; i < 999999; i++) {
            if(checkSoTN(i))
                System.out.print(i + "; ");
        }
    }

    public static boolean checkSoTN(int inputNumber) {
        String str1 = String.valueOf(inputNumber);
        StringBuilder stringBuilder = new StringBuilder(str1);
        String str2 = stringBuilder.reverse().toString();
        return str1.equals(str2);
    }
}