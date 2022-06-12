import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai5 {
    public static void main(String[] args) {
        //Bài 5.Viết chương trình thực hiện nhập một xâu họ tên theo cấu trúc: họ...đệm...tên; chuyển xâu đó sang biểu
        //diễn theo cấu trúc tên...họ...đệm.

        System.out.print("Xin mời nhập xâu ký tự: ");
        String str1 = new Scanner(System.in).nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(str1);
        String temp = "";
        String temp2 = "";

        int k = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String s = stringTokenizer.nextToken();
            if (stringTokenizer.countTokens() == 0){
                temp2=s;
                break;
            }
            temp = temp + s + " ";
        }
        System.out.println("Chuỗi kết quả là: " +  temp2 + " " + temp);
    }
}
