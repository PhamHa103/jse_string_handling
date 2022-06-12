import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai3 {
    public static void main(String[] args) {
        //Bài 3. Viết chương trình thực hiện chuẩn hoá một xâu ký tự nhập từ bàn phím (loại bỏ các dấu cách thừa, chuyển
        //ký tự đầu mỗi từ thành chữ hoa, các ký tự khác thành chữ thường)
        System.out.print("Xin mời nhập xâu ký tự: ");
        String str1 = new Scanner(System.in).nextLine();
        str1= str1.toLowerCase();
        StringTokenizer stringTokenizer = new StringTokenizer(str1);
        String[] strings = new String[100];
        int k = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String s = stringTokenizer.nextToken();
            String replace = s.replace(s.charAt(0), (char) ((int) s.charAt(0) - 32));
            strings[k] =replace;
            k++;
        }
        System.out.println("Chuỗi kí tự sau khi chuẩn hóa là: ");
        for (int i = 0; i <strings.length ; i++) {
            if (strings[i]!=null)
                System.out.print(strings[i] + " ");
        }

    }
}
