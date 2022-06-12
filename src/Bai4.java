import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai4 {
    public static void main(String[] args) {
        //Bài 4. Viết chương trình thực hiện nhập một xâu ký tự và tìm từ dài nhất trong xâu đó. Từ đó xuất hiện ở vị trí
        //nào? (Chú ý. nếu có nhiều từ có độ dài giống nhau thì chọn từ đầu tiên tìm thấy).

        System.out.print("Xin mời nhập xâu ký tự: ");
        String str1 = new Scanner(System.in).nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(str1);
        int max = 0;
        String temp = "";
        while (stringTokenizer.hasMoreTokens()) {
            String s = stringTokenizer.nextToken();
            if (s.length()>max){
                max = s.length();
                temp = s;
            }
        }
        System.out.println("Từ dài nhất xâu đó là \'" + temp + "\' xuất hiện ở vị trí thứ "+ (str1.indexOf(temp)+1));

    }
}
