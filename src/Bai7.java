import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        // Bài 7. Nhập hai xâu s1 và s2. Tìm xâu s2 trong s1. Nếu có hãy loại bỏ s2 trong s1. Chú ý: phải loại bỏ cho đến
        //khi không tìm được s2 trong s1 nữa.

        System.out.print("Xin mời nhập xâu ký tự thứ nhất: ");
        String str1 = new Scanner(System.in).nextLine();
        System.out.print("Xin mời nhập xâu ký tự thứ hai: ");
        String str2 = new Scanner(System.in).nextLine();

        StringBuilder stringBuilder = new StringBuilder(str1);
        if (stringBuilder.indexOf(str2) < 0) {
            System.out.println("Xấu kí tự 2 không thuộc xâu kí tự 1.");
            return;
        } else {
            System.out.println();
            do {
                if (stringBuilder.indexOf(str2) < 0)
                    break;
                stringBuilder.deleteCharAt(stringBuilder.indexOf(str2)-1);
                stringBuilder.replace(stringBuilder.indexOf(str2), stringBuilder.indexOf(str2) + str2.length(), "");
            } while (true);
        }
        System.out.println("Chuỗi kí tự sau khi loại bỏ chuỗi thứ 2 là: " + stringBuilder.toString());
    }
}
