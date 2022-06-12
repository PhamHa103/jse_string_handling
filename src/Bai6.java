import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai6 {
    public static void main(String[] args) {
        // Bài 6. Nhập một câu không quá 20 từ, mỗi từ không quá 10 ký tự.
        // Viết chương trình tách các từ trong câu và
        //in các từ theo thứ tự Alphabet.

        System.out.print("Xin mời nhập xâu ký tự: ");

        // Check số kí tự nhập vào
        String str1;
        do {
            str1 = new Scanner(System.in).nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(str1);
            if (stringTokenizer.countTokens() <= 20)
                break;
            System.out.print("Chỉ được nhập một câu không quá 20 từ. Xin mời nhập lại: ");
        } while (true);

        // Lưu các token vào mảng String
        StringTokenizer stringTokenizer = new StringTokenizer(str1);
        String[] strings = new String[100];
        int k = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String s = stringTokenizer.nextToken();
            strings[k] = s;
            k++;
        }
        // Sắp xếp mảng theo Alphabet
        for (int i = 0; i < strings.length-1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i]!=null && strings[j]!= null && strings[i].compareTo(strings[j]) > 0){
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j]= temp;
                }
            }
        }
        System.out.println("Chuỗi kí tự sau khi chuẩn hóa là: ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null)
                System.out.print(strings[i] + " ");
        }
    }
}

//Tại sao hàm compareTo không hoạt động đúng khi nhập tiếng Việt ????
