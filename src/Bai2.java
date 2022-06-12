import javafx.scene.transform.Scale;

import java.util.Locale;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        // Viết chương trình nhập vào một xâu ký tự s bất kỳ,
        // sau đó chuyển sang dạng xen kẽ chữ in hoa và chữ in thường.
        // Ví dụ s = ABCDefgh thì kết quả là AbCdEfGh
        System.out.print("Xin mời nhập xâu ký tự: ");
        String str1 = new Scanner(System.in).nextLine();
        str1= str1.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(str1);
        for (int i = 0; i < stringBuilder.length(); i= i+2) {
            stringBuilder.setCharAt(i, (char) (stringBuilder.charAt(i)-32));
        }
        System.out.println(stringBuilder);
    }
}
